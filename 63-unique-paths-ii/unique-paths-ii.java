class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int i= obstacleGrid.length;
        int j= obstacleGrid[0].length;

        int dp[][]= new int[i][j];
        for(int row[]:dp){
        Arrays.fill(row,-1);

        }
        return f(i-1, j-1 , obstacleGrid,dp);


        
        
    }
    public int f(int i, int j ,int grid[][],int dp[][]){
         
      //if(grid[0][0]==1 ) return 0; 
         if(i<0 ||j<0 || grid[i][j]==1)return 0;
        if(i==0 && j==0)return 1;
        if(grid[i][j]==-1)return 0;
     
        if(dp[i][j]!=-1)return dp[i][j];
        int up=f(i-1, j , grid, dp);
        int down= f(i, j-1, grid, dp);
        return dp[i][j]= up+down;

    }
}