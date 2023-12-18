class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n =nums.length;
        int ans = nums[0]*nums[1];
        int ans2= nums[n-1]*nums[n-2];
        int anss= ans2-ans;
        return anss;

        
    }
}