class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        
        int total =0;
        for(int i=0 ; i < n; i++){
            total+= nums[i];
        }
        int s2= (total - target)/2;
        
        if((total-target)%2==1) return 0;
        if(total-target<0)return 0;
        int dp[][]= new int[n][s2+1];
        for(int row[]:dp){
            Arrays.fill(row, -1);
        }
        
     return   f(n-1 , s2 , nums, dp);
        
    }
    public int f(int idx , int target , int nums[] , int dp[][]){
        if(idx==0){
            if(target==0 && nums[idx]==0){
                return 2;
            }
            if(target==0 || target==nums[0]){
                return 1;
            }
            return 0;
            
        }
        if(dp[idx][target]!=-1)return dp[idx][target];
        
        
        int not= f(idx-1 , target , nums , dp);
        int take =0 ;
        if(nums[idx]<=target){
            take= f(idx-1 , target - nums[idx], nums , dp);
            
        }
       return  dp[idx][target]= take+not;
        
    }
    
}