class Solution {
    
    public int singleNonDuplicate(int[] nums) {
        //one element present
        int n=nums.length;
        if(n==1)return nums[0];
        //first is single element
        if(nums[0]!=nums[1])return nums[0];
        //last element is not equal to second last
        if(nums[n-1]!=nums[n-2])return nums[n-1];
        int l=1;int h=n-2;
        while(l<=h){
            int mid=(l+h)/2;
            //mid is odd (even odd pair)

            if(nums[mid]!= nums[mid+1] && nums[mid-1]!=nums[mid])return nums[mid];
            if((mid%2==1 && nums[mid-1]==nums[mid] )|| (mid%2==0 && nums[mid]==nums[mid+1])){
                l=mid+1;


            } 
            else{
                h=mid-1;
            }
        }


return -1;
        
    }
}
