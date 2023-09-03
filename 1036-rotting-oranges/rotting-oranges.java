

class Pair{
    int row;
    int col;
    int tm ;
    Pair(int _row,int _col , int _tm){
        this.row = _row ; this.col= _col ; this.tm= _tm;
    }
}


class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m =grid[0].length;
        
         Queue<Pair> q= new LinkedList<>();
         int visited[][]= new int[n][m];

         int tm =0;
         int cnt=0;

         for(int i=0  ; i <n ; i++){
             for(int j=0 ; j <m ; j++){
                 if(grid[i][j]==2){
                     q.add(new Pair(i,j, 0));
                     visited[i][j]=2;

                 }
                 else{
                     visited[i][j]=0;
                 }
            //     if(grid[i][j]==1)return cnt++;
             }

         }
         int dx[]= {-1, 0 , 1, 0};
         int dy[]={0, 1, 0 , -1};
         while(!q.isEmpty()){
             int r=q.peek().row;
             int c=q.peek().col;
             int t=q.peek().tm;
             //pop in bfs
             tm= Math.max(tm , t);
             q.remove();
             for(int i=0 ; i < 4 ; i++){
                 //n row is neighbouring row
                 int nrow= r+ dx[i];
                 int ncol= c+dy[i];
                 if(nrow>=0 && ncol>=0 && nrow<n && ncol<m && visited[nrow][ncol]==0 && grid[nrow][ncol]==1){
                     q.add(new Pair(nrow , ncol , t+1));
                     visited[nrow][ncol]=2;
                     
                 }
             } 
         }
         for(int i=0 ;i < n ; i++){
             for(int j=0 ; j < m ; j++){
                 if(visited[i][j]!=2 && grid[i][j]==1  )return -1;
             }
         }
return tm;

        
    }
}