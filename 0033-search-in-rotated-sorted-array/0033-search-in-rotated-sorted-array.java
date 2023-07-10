class Solution {
    public int search(int[] nums, int target) {
        int l= 0;
        int n = nums.length;
        int r = n-1;
        while(l<=r){
            int mid= (l+r)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>=nums[l]){
                //sorted on LHS
                if(nums[mid]>=target && nums[l]<=target){
                r= mid-1;
            }
            else l=mid+1;
            }
            else if(nums[mid]<nums[r]){
                //rhs sorted
                if(nums[mid]<=target && nums[r]>=target){
                    l=mid+1;
                }
                else r= mid-1;
            }
            
        }
        return -1;
        
    }
}