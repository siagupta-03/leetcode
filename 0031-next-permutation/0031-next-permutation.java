class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int idx= -1;
        int ngi=-1;
        for(int i =n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                idx= i;
                break;
            }
        }
        if(idx==-1){
            reverse(nums, 0);
        }
        else{
            
    
        for(int i= n-1; i>= idx; i--){
            if(nums[i]>nums[idx]){
                ngi=i;

                
                break;
            }
            

        }
        swap(nums,idx, ngi);
        reverse(nums,idx+1);
        }
        

        
    }
    public static void swap(int nums[],int i, int j){
        int temp =nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
    }
    public static void reverse(int nums[] , int start){
        int i = start;
        int j= nums.length-1;
        while(i<j){
            swap(nums,i,j);
                i++;
                j--;
            }
        }
    }
