class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0;
        int h =nums.length-1;
        int first=-1;
        int last=-1;
        int arr[]= new int[2];
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]==target){
                first=mid;
                h=mid-1;
                
            }
            else if(nums[mid]<target){
                l=mid+1;

            }
            else h=mid-1;


        }
         l=0;
         h =nums.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]==target){
                last=mid;
                l=mid+1;
                
            }
            else if(nums[mid]<target){
                l=mid+1;

            }
            else h=mid-1;

        }
      arr[0]= first;
        arr[1]=last;
          return arr;
        


    }
}