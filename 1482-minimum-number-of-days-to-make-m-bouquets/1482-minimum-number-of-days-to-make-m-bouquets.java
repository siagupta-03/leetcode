
     /*
    public Boolean possible(int [] bloomDay , int day , int k , int m ){
        int cnt=0;int noOfB= 0;
        for(int i=0 ; i < bloomDay.length ; i++){
            if(bloomDay[i]<= day){
                cnt++;
                

            }

            else {
                noOfB = noOfB + cnt/k;
                cnt=0;
            }
        }
            noOfB += cnt/k;
            return noOfB>=m;
            
           
        }
           
           
    
    
    public int minDays(int[] bloomDay, int m, int k) {
        long val=(long)m*k ;
          int n = bloomDay.length;
            if(val>n){
                return -1;
            }
        int max= Integer.MIN_VALUE;;
        int min = Integer.MAX_VALUE;
        
        for(int i=0 ; i < bloomDay.length ; i++){
             max = Math.max(max, bloomDay[i]);
            min = Math.min(min, bloomDay[i]);
        }
        
         
       
      
      
int l=min;
         int h= max;
        while(l<=h){
            int mid= (l+h)/2;
            if(possible(bloomDay, mid , m , k)){
                
                h= mid-1;


            }
            else{
                // agar mid pe possible nahi hai toh uske lhs pe toh present ho hi nahi sakta 
            l=mid+1;
            }
        }
        return l;

        
    }
}
*/
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length < (long)m*k) return -1;
        int max = 0, min = Integer.MAX_VALUE;
        for(int day:bloomDay){
            max = Math.max(max, day);
            min = Math.min(min, day);
        }
        int start = min, end = max;
        while(start<end){
            int mid = start+(end-start)/2;
            int bouquet = computeDays(bloomDay, k, mid);
            if(bouquet<m){
                start = mid+1;
            }
            else end = mid;
        }
        return start;
    }
    private int computeDays(int[] bloomDay, int k, int day){
        int b = 0;
        int currFlower = 0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]>day){
                currFlower = 0;
            }
            else{
                currFlower++;
                if(currFlower>=k){
                    currFlower = 0;
                    b++;
                }
            }
        }
        return b;
    }
}