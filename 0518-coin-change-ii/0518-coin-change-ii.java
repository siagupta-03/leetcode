class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int dp[][]= new int [n][amount+1];
        for(int row[]:dp){
            Arrays.fill(row, -1);
        }
        return f(n-1, amount , coins, dp);
        
    }
    public int f(int idx , int target , int arr[], int dp[][]){
        if(idx==0){
        if(target%arr[0]==0)return 1;
            else return 0;
        }
        if(dp[idx][target]!=-1 )return dp[idx][target];
        
        int not= 0 + f(idx-1 , target , arr , dp);
        int take=0;
        if(arr[idx]<= target){
            take=  f(idx, target - arr[idx], arr, dp);
            
}
        return dp[idx][target]= take+not;
    }
}