class Solution {
    public int trap(int[] arr) {
        int lmax=0;
        int r=arr.length-1;
        int rmax=0;
        int l=0;
        int total=0;
        while(l<=r){
            if(arr[l]<=arr[r]){
            if(lmax>arr[l]){
                total+=lmax-arr[l];

            }
            else {lmax=arr[l];
            }
            l=l+1;


        }
        else{
            if(rmax>arr[r]){
                total+=rmax- arr[r];
               
            }
          else{rmax= arr[r];}
             r=r-1;

        }


    }
    return total;
}
}