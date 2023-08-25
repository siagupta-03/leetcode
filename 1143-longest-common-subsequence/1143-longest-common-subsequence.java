class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][]= new int [text1.length()][text2.length()];
        for(int rows[]:dp){
            Arrays.fill(rows, -1);
        }
        return f(text1.length()-1 , text2.length() -1, text1, text2, dp);
        
    }
    public int f(int i1, int i2, String t1 , String t2 , int dp[][]){
        if(i1<0 || i2<0)return 0;
        if(dp[i1][i2]!=-1)return dp[i1][i2];
        
        if(t1.charAt(i1)==t2.charAt(i2)){
           return dp[i1][i2]= 1+ f(i1-1, i2-1, t1, t2, dp);
        }
        else if(t1.charAt(i1)!=t2.charAt(i2)){
           return dp[i1][i2]= Math.max(f(i1-1,i2, t1, t2 , dp), f(i1, i2-1, t1, t2, dp));
        }
        
        
        return dp[i1][i2];
    }
}