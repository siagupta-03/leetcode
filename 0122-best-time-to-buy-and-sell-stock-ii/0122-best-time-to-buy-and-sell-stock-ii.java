class Solution {
    public int maxProfit(int[] prices) {
        int dp[][]= new int [prices.length][2];
        for(int row[]: dp){
            Arrays.fill(row, -1);
        }
        return f(0, 1, prices, dp);
            
        
    }
    public int f(int idx , int buy , int arr[], int dp[][]){
        if(idx==arr.length)return 0;
        if(dp[idx][buy]!=-1)return dp[idx][buy];
        int profit=0;
        
        if(buy==1){
            //buy the stock
            // 0 for not buy //1 for buy
            profit= Math.max(-arr[idx]+f(idx+1, 0, arr, dp) , 0+f(idx+1, 1, arr, dp));
        }
        if(buy==0){
            //sell the stock 
            profit = Math.max(arr[idx]+ f(idx+1, 1 , arr, dp) , 0+ f(idx+1, 0 , arr, dp));
        }
        return dp[idx][buy]= profit;
    }
    
}