class Solution {
    public int fib(int n) {
        //bottom up approach ---tab
        int dp[]= new int[n+1];
        //Arrays.fill(dp ,-1);
        if(n<=1)return n;
       
        dp[1]=1;
      // if(dp[n]!=-1){return dp[n];}
       for(int i=2;i<=n;i++){
           dp[i]=dp[i-1]+dp[i-2];}
            return dp[n];
       
    }
}