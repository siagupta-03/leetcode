class Solution {
    public boolean isPalindrome(String s) {
        int l=0;
        int h =s.length()-1;
        while(l<=h){
            char lchar= s.charAt(l);
            char rchar=s.charAt(h);
           
             if(!Character.isLetterOrDigit(rchar)){
                h--;
            }
            else if(!Character.isLetterOrDigit(lchar)){
                l++;}
                
            else{
                 if(Character.toLowerCase(lchar)!=Character.toLowerCase(rchar)){
                return false;
                
            }

            l++;
            h--;
            }
        }
        return true;

        
    }
}