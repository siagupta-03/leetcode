class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int h =nums.length-1;
        int ans= Integer.MAX_VALUE;
        while(l<=h){

            int mid= (l+h)/2;
            //lhs sorted

            if(nums[l]<=nums[mid]){
                ans=Math.min(ans,nums[l]);
                l=mid+1;
            }
            //rhs sorted
            else if(nums[mid]<=nums[h]){
                ans=Math.min(ans,nums[mid]);
                h=mid-1;
            }
        }
        return ans;
        
    }
}