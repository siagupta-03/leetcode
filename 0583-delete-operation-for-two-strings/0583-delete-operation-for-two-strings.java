class Solution {
    public int f( String s1 , String s2){
         int n = s1.length();
        int m = s2.length();
         int dp[][]= new int [n+1][m+1];
        for(int i1=0 ; i1<=s1.length();i1++){
            dp[i1][0]=0;
        }
        for(int i2=0 ; i2<=s2.length(); i2++){
            dp[0][i2]=0;
        }
        for(int i1=1 ; i1<=s1.length(); i1++){
            for(int i2=1 ; i2<=s2.length(); i2++){
                if(s1.charAt(i1-1)==s2.charAt(i2-1)){
          dp[i1][i2]=1+dp[i1-1][i2-1];
        }
        else{
            dp[i1][i2]=Math.max(dp[i1-1][i2], dp[i1][i2-1]);
        }
        
                
            }
        }
        return dp[s1.length()][s2.length()];
       
    }
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
       
        int k= f(word1, word2);
        
        int deletion = n-k;
        int add= m-k;
        return deletion + add;
        
    }
}