class Solution {
    public int countSeniors(String[] details) {
        int cnt=0;
        for(String info :details){
            char a = info.charAt(11);
            char b= info.charAt(12);
        if(a>'6'  || a=='6' && b>'0'){
            cnt++;
        }
        }
        return cnt;
    }
}