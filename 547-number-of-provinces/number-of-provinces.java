class Solution {
    //adjacency matrix given and not list hence will convert matrix to list
public void dfs(int node ,  ArrayList<ArrayList<Integer>> adj, int visited []){

    visited[node]=1;
    for(Integer it : adj.get(node)){
        if(visited[it]==0){
            dfs(it , adj ,  visited);
        }
    }

}


    public int findCircleNum(int[][] isConnected) {
         int  V = isConnected.length;
        ArrayList<ArrayList<Integer>> adjls = new ArrayList<>(V);
       
        for(int i=0 ; i <V ; i++){
            adjls.add(new ArrayList<>());

        }
        //to change adj matrix to lisy
    for(int i=0  ; i < V ; i++){
        for(int j =0 ; j < V ; j++){
            if(isConnected[i][j]==1 && i!=j){
                adjls.get(i).add(j);
                adjls.get(j).add(i);
            }
        }
    }
    int visited []= new int[V];
    int cnt=0 ;
    for(int i=0 ; i <V ; i++){
        if(visited[i]==0){
            cnt++;
            dfs(i , adjls , visited);

        }
        

    

    }
    
return cnt;
    }
}