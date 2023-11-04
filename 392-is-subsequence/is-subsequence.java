class Solution {
    public boolean isSubsequence(String s, String t) {

        int dp[][]= new int [s.length()][t.length()];
        for(int row[]: dp){
            Arrays.fill(row, -1);
        }
        // ans ie the number of common subsequnece should be equal to complete string s
        if(f(s.length()-1 , t.length()-1, s, t, dp)== s.length()){
        return true;}
        return false;
        
    }
    public int f (int i1, int i2, String s , String t , int dp[][]){
        if(i1<0 || i2<0)return 0;




        if(dp[i1][i2]!=-1)return dp[i1][i2];



        if(s.charAt(i1)==t.charAt(i2)){
          dp[i1][i2]= 1+ f(i1-1, i2-1 , s , t , dp);

        }
        else if (s.charAt(i1)!=t.charAt(i2) ){
             dp[i1][i2]= Math.max(f(i1-1, i2, s, t, dp) , f(i1, i2-1 , s , t ,dp));
        }
        return dp[i1][i2];
        
    }
}