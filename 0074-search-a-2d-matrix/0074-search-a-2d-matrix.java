class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n= matrix.length;
        int m = matrix[0].length ;
        
        
        int low=0 ;
        int h = (n*m)-1;
        while(low<=h){
            int mid = (low+h)/2;
            if(matrix[mid/m][mid%m]== target){
                return true;
            }
            else if(matrix[mid/m][mid%m]<target){
                low= mid+1;
            }
            else if (matrix[mid/m][mid%m]>target){
                h= mid-1;
            }
            
                
            }
        
        
             return false;
        
    }
    }
