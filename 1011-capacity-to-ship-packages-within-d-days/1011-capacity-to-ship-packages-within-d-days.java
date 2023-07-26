class Solution {
    public int days(int [] weights , int capacity){
        int days= 1;
        int load=0;
        for(int i=0 ; i<weights.length ; i++){
            if(weights[i]+load>capacity){
                days=days+1;
                load= weights[i];
            }
            else {
                load= load+weights[i];
            }
        }
return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low= Integer.MIN_VALUE; int high =0;
        for(int i=0 ; i < weights.length ; i++){
            high = high+ weights[i];
            low= Math.max(low,weights[i]);
        }
    while(low<=high){
        int mid= (low+high)/2;
        int number = days(weights, mid);
            if(number<=days){
                high = mid-1;
            }
            else{
                low= mid+1;
            }
            
        }
        return low;

    }

        
    }
