class Solution {
    public int cherryPickup(int[][] grid) {
         int n = grid.length;
        int m =grid[0].length;
        int dp [][][]= new int[n][m][m];
        for(int row1[][]: dp){
            for(int row2[]:row1 )
            Arrays.fill(row2 , -1);
        }
        return f(0, 0, m-1, grid , dp);
        
        
    }
    public int f(int i , int j1, int j2 , int grid[][] , int dp[][][]){
        //out of bound
        int n = grid.length;
        int m= grid[0].length;
            
                            
        if(j1<0 || j1>m-1 || j2<0 || j2>m-1){
            return (int)(Math.pow(-10, 9));
            
        }
        //base case
        if(i== n-1){
            if(j1==j2){return grid[i][j1];}
            else {
                return grid[i][j1]+grid[i][j2];
            }
        }
        if(dp[i][j1][j2]!=-1)return dp[i][j1][j2];
        
        //9 combos 
        int maxi = Integer.MIN_VALUE;
        for(int dj1= -1 ; dj1<2; dj1++){
            for(int dj2= -1 ; dj2<2 ;dj2++ ){
                int ans= 0;
                if(j1==j2){
                  ans=   grid[i][j1]+ f(i+1 , j1+dj1, j2+dj2, grid , dp);
                    
                }
                else{
                   ans= grid[i][j1] +grid[i][j2] + f(i+1 , j1+dj1 , j2+dj2, grid , dp);
                }
                maxi=Math.max(ans , maxi) ;
            }
        }
        return dp[i][j1][j2]= maxi;
    }
}