class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        if(rowIndex==0){
            return ans ;

        }
        long res =1;
        for(int i=1; i <rowIndex ; i++ ){
            res= res*(rowIndex-i+1)/i;
            ans.add((int)res);
        }
        ans.add(1);
        return ans;
    }
}