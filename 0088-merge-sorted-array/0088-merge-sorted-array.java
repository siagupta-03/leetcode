class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = m-1;
        int right = n-1;
        int merged = m+n-1;
        while(left>=0 && right>=0){
            if(nums1[left]>nums2[right]){
              //  int temp = nums1[left];
                nums1[merged]= nums1[left];
               // nums2[right]= temp;
                
                left--;//right++;
                
            }
            else{
                //corect order
               // break;
                nums1[merged]= nums2[right];
                right--;
            }
            merged--;
        }
            while (right >= 0) {
            nums1[merged] = nums2[right];
            right--;
            merged--;
        }
        //Arrays.sort(nums1);
       // Arrays.sort(nums2);
        
    }
}
  