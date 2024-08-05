class Solution {
    public String kthDistinct(String[] arr, int k) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            String curr= arr[i];
            boolean isDistinct=true;
            for(int j=0;j<n;j++){
                //same string== stop comparing with itself
                if(j==i)continue;
                if(arr[j].equals(curr)){
                    isDistinct=false;
                    break;
                }
            }
            if(isDistinct){
                k--;
            }
            if(k==0)return arr[i];
        }
        return "";
    }
}