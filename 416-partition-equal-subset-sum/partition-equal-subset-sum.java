class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }

        if(sum%2==1)return false;
      
            int k=sum/2;
               
        
        int dp[][]= new int[nums.length][k+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return f(dp, nums.length-1, k, nums);


        
    }
    public boolean f(int dp[][], int idx , int sum , int arr[]){
        if(sum==0)return true;
        if(idx==0)return arr[0]==sum;
        if(dp[idx][sum]!=-1){return dp[idx][sum]==1;}

        

        boolean take= false;
        if(sum>=arr[idx]){
            take= f(dp, idx-1, sum-arr[idx], arr);

        }
        boolean not= f(dp, idx-1, sum , arr);
        dp[idx][sum] =(take || not) ?1:0;
        return take ||not;
    }

}