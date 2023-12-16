class Solution {
    public boolean isAnagram(String s, String t) {
        int n =s.length();
        int m= t.length();

        HashMap<Character , Integer> hm1 = new HashMap<>();
         HashMap<Character , Integer> hm2= new HashMap<>();
         if(n!=m)return false;
         

         for(int i=0 ; i< n ;i++){
             char ch1= s.charAt(i);
             if(!hm1.containsKey(ch1)){
                 hm1.put(ch1, 1);
             }
             else{
                 int freq= hm1.get(ch1);
                 hm1.put(ch1, freq+1);
             }
         }

         for(int i=0 ; i< n ;i++){
             char ch2= t.charAt(i);
             if(!hm2.containsKey(ch2)){
                 hm2.put(ch2, 1);
             }
             else{
                 int freq= hm2.get(ch2);
                 hm2.put(ch2, freq+1);
             }
         }
         return hm1.equals(hm2);
        
    }
}