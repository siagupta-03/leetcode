class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int maxSum=0;
        int rightIdx=cardPoints.length-1;
        int lsum=0;
        int rsum=0;
        for(int i=0;i<k;i++){
            lsum=lsum+cardPoints[i];
            maxSum=lsum;
        }
        for(int i=k-1;i>=0;i--){
            lsum=lsum-cardPoints[i];
            
            rsum=rsum+ cardPoints[rightIdx];
            rightIdx=rightIdx-1;
            maxSum=Math.max(maxSum,lsum+rsum);

        }
        return maxSum;
    }
}