class Solution {
    public int maxProfit(int[] prices) {
        int dp[][]= new int [prices.length][2];
        for(int row[]: dp){
            Arrays.fill(row, -1);
        }
        return f(0, 1, prices, dp);
        
    }
    public int f(int i , int  buy  , int arr[], int dp[][]){
        if(i>=arr.length)return 0;
        
        if(dp[i][buy]!=-1)return dp[i][buy];
        
        int profit=0;
        if(buy==1){
            //you can buy
            profit= Math.max(-arr[i]+ f(i+1, 0, arr , dp), 0+ f(i+1, 1, arr , dp));
            
        }
        if(buy==0){//sell
            profit= Math.max(arr[i]+f(i+2 , 1, arr , dp), 0+f(i+1, 0 , arr, dp));
        }
        return dp[i][buy]=profit;
        
        
    }
}