class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List <List<Integer>> result = new ArrayList<>();
         rec(0, nums, new ArrayList<>() , result);
         return result;


       

        
    }
    public static void rec(int idx , int []nums , List<Integer> ds , List<List<Integer>> result){
         if(idx>=nums.length){
             result.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[idx]);
        rec(idx+1,nums, ds,result);
        ds.remove(ds.size()-1);
        rec(idx+1 ,nums,  ds, result);
    }
}