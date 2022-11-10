/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DP2;

/**
 *
 * @author Aditya
 */
public class b_LCS_longCommonSubsequence {
    
        private static int LCS(String str1, String str2, int i, int j) {
           //base case
            if(i==str1.length()||j==str2.length()){
                return 0;   //empty common subsequence means 0 subsequence
            }
            int myans;
            if(str1.charAt(i)==str2.charAt(j)){
                int ans=LCS(str1, str2, i+1, j+1);
                myans=1+ans;
            }
            else{
                int ans1=LCS(str1, str2, i+1, j);
                int ans2=LCS(str1, str2, i, j+1);
                myans=Math.max(ans1, ans2);
            }
            return myans;
            
            
        }
 
                private static int LCSmemoization(String str1, String str2, int i, int j,int dp[][]) {
                    if(i==str1.length()||j==str2.length()){
                return 0;   //empty common subsequence means 0 subsequence
            }
            int myans=0;
            if(str1.charAt(i)==str2.charAt(j)){
                int smallans;
                if(dp[i+1][j+1]==-1){
                    smallans=LCS(str1, str2, i+1, j+1);
                    dp[i+1][j+1]=smallans;
                    else{
                            smallans=dp[i+1][j+1];
                            }
                myans=1+ans;
            }
            }
            else{
                int ans1,ans2;
                if(dp[i+1][j]==-1){
                    ans1=LCS(str1, str2, i+1, j);
                    dp[i+1][j]=ans1;
                }
                else{
                    ans1=dp[i+1][j];
                }
                if(dp[i][j+1]==-1){
                    ans2=LCS(str1, str2, i, j+1);
                    dp[i][j+1]=ans2;
                }
                    else{
                            ans2=dp[i][j+1];
                            }
                myans=Math.max(ans1, ans2);
            }
            return myans;
            
                

                }
    public static void main(String[] args){
        String str1="adgjl";
        String str2="sdfghj";
        
        int ans=LCS(str1,str2,0,0);
        System.out.println(ans);
        
        int dp[][]=new int[str1.length()+1][str2.length()+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;i++){
                dp[i][j]=-1;
            }
        }
        
    }

 
}
