class Solution {
    public int[][] imageSmoother(int[][] img) {
        int ans[][]= new int [img.length][img[0].length];
        for(int i=0;i<img.length ; i++){
            for(int j=0;j<img[0].length ;j++){
                int sum=0;
                int count=0;
                for(int x=i-1; x<=i+1; x++){
                    for(int y=j-1; y<=j+1; y++){
                        if(x>=0 && x<img.length && y>=0 && y<img[0].length){
                            sum=sum+img[x][y];
                            count+=1;
                        }
                    }
                }
                ans[i][j]=sum/count;


            }
            
        }
        return ans;
        
    }
}