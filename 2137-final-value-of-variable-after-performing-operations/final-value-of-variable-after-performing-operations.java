class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int a=0;
        for(int i=0 ; i< operations.length ; i++){
            String s= operations[i];
            if(s.charAt(1)=='-'){
            a=a-1;

        }
        else if(s.charAt(1)=='+'){
            a=a+1;
        }
        
    }
    return a;

        
        
}}