class Solution {
    public int maxProfit(int[] prices, int fee) {
        int dp[][]= new int [prices.length][2];
        for(int row[]:dp){
            Arrays.fill(row, -1);
        }
        return f(0, 1 , fee, prices, dp);
        
    }
    public int f(int i , int buy , int fee, int arr[], int dp[][]){
        if(i==arr.length )return 0;
        int profit=0;
        if(dp[i][buy]!=-1)return dp[i][buy];
        
        if(buy==1){
            profit= Math.max(-arr[i]+f(i+1, 0,fee, arr, dp), 0+ f(i+1, 1,fee, arr, dp));
            
        }
        if(buy==0){
            profit= Math.max(arr[i]+f(i+1 , 1,fee, arr, dp)-fee, 0+ f(i+1 , 0 ,fee, arr, dp));
        }
        return dp[i][buy]= profit;
    }
}