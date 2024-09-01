class Solution {


    public class Pair implements Comparable<Pair>{
        int key;
        int value;
        public Pair (int key, int value){
            this.key=key;
            this.value=value;

        }
        public int compareTo(Pair o){
            if(this.key!=o.key)
                return o.key-this.key;
            return o.value-this.value;
            
        }

    }
    
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        PriorityQueue<Pair> he= new PriorityQueue<>();
        ArrayList<Integer> ans= new ArrayList<>();

        for(int i =0;i<arr.length;i++){

            he.add(new Pair(Math.abs(arr[i]-x), arr[i]));

            if(he.size()>k){
                he.poll();
            }

        } 
        while(he.size()>0){
            ans.add(he.poll().value);
            

        }
        Collections.sort(ans);
        return ans;
        
    }
}