class Solution {
    public int numberOfMatches(int n) {
        int matches=0;
        int teams=0;
       while(n>1){
        if(n%2==0){
            matches+=n/2;
            n=n/2;
        }
        else if(n%2==1){
            matches+= (n-1)/2;
            n= (n-1)/2+1;
        }}
        return matches;
    }
}