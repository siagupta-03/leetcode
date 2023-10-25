class Solution {
    public int rec(int n, int k) {
        if(n==1 && k==1) return 0;

int total=  (int)Math.pow(2,(n-1));
int mid= total/2;
        if(k<=mid){
            return rec(n-1, k);


        }
        else{
            return 1- rec(n,k-mid);
        }

        
    }
    public int kthGrammar(int n , int k ){
        return rec(n , k);
    }
}