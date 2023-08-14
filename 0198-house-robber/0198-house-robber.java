class Solution {
    public int rob(int[] nums) {
        int dp[]= new int [nums.length+1];
        Arrays.fill(dp , -1);
        return f(nums , dp , nums.length -1);
        
    }
    public int f(int [] nums , int dp[] , int idx ){
        if(idx==0 )return nums[0];
        if(idx< 0)return 0;
        if(dp[idx]!=-1)return dp[idx];
        
        int pick = nums[idx]+ f(nums , dp , idx-2);
        int notp= 0 + f( nums , dp , idx-1);
        return dp[idx]= Math.max(pick , notp);
    }
    
}