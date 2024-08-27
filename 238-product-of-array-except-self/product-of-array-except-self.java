class Solution {
    public int[] productExceptSelf(int[] nums) {
        
int n=nums.length;

        int pre[]= new int [nums.length];
        int suff[]= new int[nums.length];
        int ans[]=new int[nums.length];

        for(int i=1;i<nums.length;i++){
            pre[0]=1;
            pre[i]=pre[i-1]*nums[i-1];
        
        }
        for(int j=n-2;j>=0;j--){
            suff[n-1]=1;
          suff[j]=suff[j+1]*nums[j+1];
        }

       for(int k=0;k<n ;k++){
        ans[k]= suff[k]*pre[k];
       }
       return ans;
    }
}