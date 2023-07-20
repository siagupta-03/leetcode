class Solution {

    public int calc(int nums[] ,int divisor){
        int sum=0;
       

        
        for(int i =0 ; i < nums.length ; i++){
            sum+=Math.ceil((double)(nums[i])/(double)(divisor));
        }
        return sum;

    }
    
    public int smallestDivisor(int[] nums, int threshold) {
        int maxi= nums[0];
        for(int i=0 ; i < nums.length ; i++){
            maxi= Math.max(maxi , nums[i]);
        }

        int l=1;
        int h= maxi;
        int ans = -1;

        while(l<=h){
            int mid = (l+h)/2;
            if(calc(nums , mid)<= threshold){
            ans= mid;
            h= mid-1;
        }
        else{
            l=mid+1;
        }
       
    }
     return ans;
    }
}