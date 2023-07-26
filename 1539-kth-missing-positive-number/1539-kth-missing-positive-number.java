class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n =arr.length-1;
        int l=0 ;
        int h= n;
        while(l<=h){
            int mid= (l+h)/2;
            int missing = arr[mid]- (mid+1);
            if(missing<k){
                l= mid+1;
                
            }
            else{
               h= mid-1;
            }
        }
         return (h+1+k);
        
    }
}