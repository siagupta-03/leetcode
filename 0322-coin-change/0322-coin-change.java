class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int dp[][]= new int[coins.length][amount+1];
        for(int row[]: dp){
            Arrays.fill(row, -1);
        }
        int ans =f(coins.length-1, amount , coins , dp);
         if(ans >= (int)Math.pow(10,9)) return -1;
    return ans;
        
        
    }
    public int f(int i, int target , int arr[], int dp[][]){
        if(i==0){
            if(target%arr[i]==0)return target/arr[i];
            else return (int)Math.pow(10,9);
        }
        
        
        if(dp[i][target]!= -1)return dp[i][target];
        int take =(int)Math.pow(10,9);
        if(arr[i]<=target){
            take= 1+ f(i , target-arr[i], arr , dp);
}
        
         int not =0+ f(i-1 ,target , arr, dp );
        return dp[i][target]= Math.min(take, not);
    }
}