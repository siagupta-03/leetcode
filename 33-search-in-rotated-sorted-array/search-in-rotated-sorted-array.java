class Solution {
    public int search(int[] nums, int target) {
        
        int l=0;
        int h=nums.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]==target)return mid;
            //left sorted
            if(nums[l]<=nums[mid]){
                if(nums[l]<=target && nums[mid]>=target){
                    h=mid-1;
                }
                else l=mid+1;
            }
            //right sorted
            else{
                //mid and high ke beech kya target
                if(nums[mid]<=target && nums[h]>=target){
                    l=mid+1;

                }
                else h=mid-1;

            }
        }
        return -1;
    }
}