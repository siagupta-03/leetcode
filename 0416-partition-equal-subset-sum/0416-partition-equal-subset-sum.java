class Solution {
    public boolean canPartition(int[] nums) {
        
        int totalSum =0 ;
        for(int i=0 ; i < nums.length ; i++){
            totalSum+= nums[i];
        }
        if(totalSum%2==1)return false;
        else{
            int k = totalSum /2;
                
    boolean dp[][]= new  boolean [nums.length][k+1];
        
        //if(target==0)return true
        for(int i=0 ; i < nums.length ; i++){
        dp[i][0]= true;
    }
        //index=0
        if(nums[0]<=k){
        dp[0][nums[0]]= true;}
        //nested loop
        for(int i =1 ; i < nums.length  ; i++){
            for(int target =0 ; target <= k ; target++){
                boolean not = dp[i-1][target];
                boolean taken = false;
                if(target>=nums[i]){
                    taken = dp[i-1][target- nums[i]];
                    
                }
                dp[i][target]=  not || taken;
            }
            
        }
        
return dp[nums.length-1][k];
        }
            
}
}