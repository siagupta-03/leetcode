class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i=1 ; i<=numRows; i++){
            List<Integer> temp = new ArrayList<>();
            temp.addAll(generateRow(i));
            triangle.add(temp);
        }
        return triangle;

        
    }
    public static List<Integer> generateRow(int row){
        int ans=1;
        List<Integer> ansRow= new ArrayList<>() ;
        ansRow.add(1);
        for(int col=1; col<row ; col++){
            ans=ans*(row-col);
            ans=ans/col;
            ansRow.add((int)ans);
        }
        return ansRow;


    }
}