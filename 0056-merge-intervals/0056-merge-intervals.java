class Solution {
    public int[][] merge(int[][] intervals) {
       List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, new Comparator <int[]>(){
            public int compare (int a[], int []b){
                return a[0]-b[0];
        }});
        for(int i=0 ; i < intervals.length ; i++){
         //   if(ans.isEmpty() || intervals[i][0]> ans.get(ans.size()-1).get(1)){
            if (ans.isEmpty() || intervals[i][0] > ans.get(ans.size() - 1)[1]) {

            ans.add(intervals[i]);
        }
            else{
                ans.get(ans.size()-1)[1]=Math.max(ans.get(ans.size()-1)[1], intervals[i][1]);
            }
    }
        return ans.toArray(new int[ans.size()][]);
}
}