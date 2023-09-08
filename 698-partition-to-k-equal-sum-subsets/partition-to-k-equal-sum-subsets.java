
// not passing all cases of minw
class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        for(int num: nums)
        {
            sum+=num;
        }
        if(sum%k!=0) return false;
        int target=(int)sum/k; 
        //using boolean class dp since it is initialized by null and it prevents the problem in differentiating the updated false values ans the default initialized false value.
        Boolean[][] dp = new Boolean[k+1][1<<17];
       
        return solve(nums,k,(1<<n)-1,0,target,dp);
    }

    public boolean solve(int[] nums, int k, int mask,int cursum, int target, Boolean[][]dp)
    {
        if(mask==0)
        {
            if(k==0) return true;
            return false;
        }
        
        if(k==0) return true;
         if(dp[k][mask]!=null)  return dp[k][mask];
          

        boolean val=false;
        for(int i=0;i<nums.length;i++)
        {
             
            if((mask & (1 << (nums.length - i - 1))) != 0)
            {
                 
                if(cursum+nums[i]<target)
                { 
                    val |= solve(nums,k,mask& ~(1 << (nums.length - i - 1)),cursum+nums[i],target,dp);
                }
                if(cursum+nums[i]==target)
                {
                    val |= solve(nums,k-1,mask &  ~(1 << (nums.length - i - 1)),0,target,dp);
                }
            }
        }
       
        return  dp[k][mask]=val;

    }
}