class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int l=0; int maxi=Integer.MIN_VALUE;
        for(int i=0; i<piles.length;i++){
            maxi=Math.max(maxi, piles[i]);
           
        }
        int high=maxi;

        while(l<=high){
            int mid=(l+high)/2;
            if(f(piles, mid)<=h){
                high=mid-1;
            }
            else l=mid+1;
        }
        return l;
    }
    public int f(int piles[], int h){
       int totalhrs=0;
        for(int i=0;i<piles.length;i++){
            totalhrs+= Math.ceil((double)(piles[i])/(double)(h));
        }
        return totalhrs;
    }
}