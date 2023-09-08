class Solution {
    public int numSquares(int n) {
        int dp[]= new int[n+1];
        Arrays.fill(dp,-1);
        return f(n , dp);
        

    }
    public int f(int n , int dp[] ){
        if(n<4)return n ;
        if(dp[n]!=-1)return dp[n];
int ans =n;//assuming 12 can be represented as 1+1.. initially
        for(int i=1; i*i <=n; i++ ){
            int sq= i*i;
            ans = Math.min(ans ,1+ f(n-sq,dp));
        }
        return dp[n]=ans;
    }
}