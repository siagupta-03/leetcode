class Solution {
    public int climbStairs(int n) {
    

    //memoization 
  
    int dp[]= new int[n+1];
    Arrays.fill(dp,-1);
    return f(dp , n);}

    public int f(int []dp ,int n  ){
          if(n==0)return 1;
          if(n==1)return 1;
            if(dp[n]!=-1)return dp[n];
                
    return    dp[n]=f(dp,n-1)+f(dp,n-2);

    }
        }