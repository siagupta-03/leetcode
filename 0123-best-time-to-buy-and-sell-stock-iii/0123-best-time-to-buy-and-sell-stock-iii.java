class Solution {
    public int maxProfit(int[] prices) {
        int dp[][][]= new int [prices.length][2][3];
        for(int row1[][]:dp){
            for(int row2[]: row1){
            Arrays.fill(row2, -1);
        }}
        return f(0 , 1, 2, prices, dp);
        
    }
    public int f(int i , int buy , int cap , int arr[], int dp[][][]){
        if(i==arr.length)return 0;
        if(cap==0)return 0;
        if(dp[i][buy][cap]!=-1)return dp[i][buy][cap];
        
        
        int profit=0 ;
        if(buy==1){
            profit= Math.max(-arr[i]+ f(i+1, 0, cap, arr, dp), 0+f(i+1, 1 , cap , arr, dp));
        }
        if(buy==0){
            profit= Math.max(arr[i]+f(i+1, 1, cap-1, arr, dp), 0+f(i+1, 0, cap, arr, dp));
        }
        return dp[i][buy][cap]= profit;
        
    }
}