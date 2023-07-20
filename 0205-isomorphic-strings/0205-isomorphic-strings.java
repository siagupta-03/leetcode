class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n= s.length();

        int n2= t.length();
        // create map
        int map1 []= new int [200];
        int map2 [] = new int [200];
        for(int i=0 ; i <n ; i++){
            
            if(map1[s.charAt(i)] != map2[t.charAt(i)]){
               return false;
               }
            map1[s.charAt(i)]= i+1;
            map2[t.charAt(i)]= i+1;

        }
         return true;

    
}
}


