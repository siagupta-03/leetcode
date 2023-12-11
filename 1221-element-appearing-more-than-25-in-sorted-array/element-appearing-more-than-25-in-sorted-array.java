class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer , Integer> hm = new HashMap<>();
            int target =arr.length/4;

            for(int i=0; i<arr.length ;i++){
                hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);

            }
            for(int key: hm.keySet()){
                if(hm.get(key)>target){
                    return key;
                }
            }

        
        return -1;
        
    }
}