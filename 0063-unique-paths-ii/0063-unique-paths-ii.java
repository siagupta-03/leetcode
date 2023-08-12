class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int dp [][]= new int[m][n];
        for(int row[]:dp){
            Arrays.fill(row , -1);
        }
      return   f(m-1 , n-1, obstacleGrid , dp);
        
        
    }
    public int f(int i , int j ,int grid[][], int dp[][]){
        
       
      if(grid[0][0]==1 ) return 0;
   
        
      // if( i>0 && j >0 ) return 0;
        if(i==0 && j==0 ) return 1;
        
        if(i < 0 || j < 0 || grid[i][j]==1)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        
    int up=  f(i-1, j, grid , dp);
        int left =  f(i, j-1, grid, dp) ;
     //    int up = i > 0 ? dp[i - 1][j] : 0;
       //             int left = j > 0 ? dp[i][j - 1] : 0;
            
    
         return dp[i][j] =up+left;
       
}
}