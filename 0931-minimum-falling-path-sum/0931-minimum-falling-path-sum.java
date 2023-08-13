class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length ;
        int m = matrix[0].length ;
        int dp[][]= new int[m][n];
        
        for(int j = 0 ; j < m ; j++){
            dp[0][j]= matrix[0][j];
        }
       
        for(int i = 1 ; i <n; i++ ){
            for(int j =0 ; j < m ; j++){
                 int up=matrix[i][j];
        int right =matrix[i][j]; int left=matrix[i][j];
                
                 up = matrix[i][j] + dp[i-1][j];
                
               if(j-1>=0){
                   left = matrix[i][j] + dp[i-1][j-1];}
                else{
                    left+= (int)1e9;
                }
                
                
               if(j+1< m){
                   right= matrix[i][j] + dp[i-1][j+1];}
                else{
                    right+=(int)1e9;
                }
                int mini = Math.min(up , left);
                dp[i][j] = Math.min(mini, right);
            }
        }
        
    int maxi = Integer.MAX_VALUE;
    
    for(int j=0; j<m;j++){
        maxi = Math.min(maxi,dp[n-1][j]);
    }
    
    return maxi;
        
    }
}