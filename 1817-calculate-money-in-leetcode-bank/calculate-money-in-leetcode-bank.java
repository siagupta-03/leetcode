class Solution {
    public int totalMoney(int n) {
        int sum=0;
        int mon=1;
        while(n>0){
            int money=mon; //1
            for(int day=1; day<=Math.min(n,7); day++){
              sum=  sum+money;//1
              money++;//2
            }
            n=n-7;
            mon++;
        }
        return sum;
    }
}