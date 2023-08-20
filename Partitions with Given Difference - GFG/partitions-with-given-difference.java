//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int d=sc.nextInt();
            
            int []arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            
            Solution obj=new Solution();
            int res=obj.countPartitions(n, d, arr);
            System.out.println(res);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//Back-end complete function Template for Java

class Solution{

    public int countPartitions(int n, int d, int arr[]){
        int mod = 1000000007;
        int total = 0;
        for(int i =0 ; i < n ; i++){
            total+= arr[i];
            
        }
        if((total- d)<0)return 0;
        if((total-d)%2==1)return 0;
        
        int s2= (total-d)/2;
        int dp [][]= new int [n][s2+1];
        
        for(int row[]: dp){
            Arrays.fill(row, -1);
            
        }
        return f(n-1, s2 , arr , dp);
        
        
    }
    public int f(int i , int target , int arr[] , int dp[][]){
         int mod = 1000000007;
        if(i==0){
              if(target==0 && arr[i]==0 )return 2;
        if(target==0 || target == arr[i])return 1;
      
       else  return 0;}
        if(dp[i][target]!=-1)return dp[i][target];
        
        int not= f(i-1 , target , arr, dp)%mod;
        int take =0 ;
        if(arr[i]<= target){
            take = f( i-1 , target - arr[i] , arr , dp)%mod;
            
        }
        return  dp[i][target]= (take+not)%mod;
    }
    
}
