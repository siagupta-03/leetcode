class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n =nums.length;
        int res[]= new int[nums.length];
        int pos= 0;
        int neg=1;
        for(int i =0 ; i < n ; i++){
            if(nums[i]>0){
                res[pos]=nums[i];
                pos= 2+pos;

            }
            else{
                res[neg]= nums[i];
                neg= 2+neg;
            }
        }
        return res;
        
    }
}