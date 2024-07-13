class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int l=0;int h=0;
        int min =0; int max=0;
        for(int i=0;i<bloomDay.length;i++){
            min=Math.min(min, bloomDay[i]);
            max=Math.max(max,bloomDay[i]);

        }
        l=min;
        h=max;
       // if(m * 1LL * k * 1LL>bloomDay.length)return -1;
        long var=(long)m*k;
        if(var>bloomDay.length) return -1;
        
        while(l<=h){
            int mid= (l+h)/2;
            int ans=0;
            if(possible(bloomDay, mid, m , k)){
                ans=mid;
                h=mid-1;

            }
            else l=mid+1;
        }
      return l;

    }
    public boolean possible(int[] bloomDay, int day, int m, int k){
   int nb=0;
    int cnt=0;
    for(int i=0;i<bloomDay.length;i++){
        if(bloomDay[i]<=day)cnt++;
        else {nb=nb+(cnt/k);
        cnt=0;}}
        nb+=(cnt/k);
        if(nb>=m)return true;
        else return false;


    }



    
}