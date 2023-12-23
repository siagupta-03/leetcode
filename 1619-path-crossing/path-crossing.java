class Solution {
    public boolean isPathCrossing(String path) {
        
        Set<String> st = new HashSet<>();
        int x=0;
        int y=0;
        st.add(0+","+0);
        for(char c :path.toCharArray()){
            if(c=='N'){
                y++;
            }else if(c=='E'){
                x++;
            }
            else if(c=='S'){
                y--;
            }
            else if(c=='W'){
                x--;
            }
            String coo= x +","+y;
            if(st.contains(coo))return true;
            st.add(coo);



        }
        return false;
    }
}