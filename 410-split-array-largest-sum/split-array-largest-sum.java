class Solution {
    public int splitArray(int[] nums, int k) {

        int l=0; int h=0;int sum=0;
        int maxi=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            maxi=Math.max(maxi,nums[i]); }
            l=maxi;
            h=sum;

            while(l<=h){
                int mid=(l+h)/2;
                if(f(nums, mid)>k){
                    l=mid+1;
                }
                else h=mid-1;
            }
            return l;
        
    }


    public int f(int arr[], int k){
        int student=1;
        int pages=0;
        for(int i =0;i< arr.length ;i++){
            if(pages+arr[i]<=k){
                pages+= arr[i];
            }
            else {student++;
            pages=arr[i];}
        }
        return student;
    }
}