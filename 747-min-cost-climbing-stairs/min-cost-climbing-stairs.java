class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp[]= new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(f(cost.length-1, cost , dp), f(cost.length-2 , cost , dp));


        
    }
    public int f(int idx , int cost[], int dp[]){
        if(idx<0)return 0;
        if(idx==0 || idx==1)return cost[idx];



        if(dp[idx]!=-1)return dp[idx];
        return dp[idx]= cost[idx]+ Math.min(f(idx-1, cost , dp), f(idx-2, cost, dp));
        

    }
}