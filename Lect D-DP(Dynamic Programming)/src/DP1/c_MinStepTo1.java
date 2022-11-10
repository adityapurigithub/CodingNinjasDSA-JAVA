/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DP1;

import java.util.Scanner;

/**
 *
 * @author Aditya
 */
public class c_MinStepTo1 {
    
    public static int MinStepsTo1(int n){
        if(n==1){
            return 0;
        }
        int ans1=MinStepsTo1(n-1);
        int ans2=Integer.MAX_VALUE;
        if(n%2==0){
            ans2=MinStepsTo1(n/2);
        }
        
        int ans3=Integer.MAX_VALUE;
        if(n%3==0){
            ans3=MinStepsTo1(n/3);
        }
        return 1+Math.min(ans1, Math.min(ans2,ans3));
        
    }
    public static int minstepto1DP(int n,int dp[]){
        if(n==1){
            return 0;
        }
        int ans1;
        if(dp[n-1]==-1){
            ans1=MinStepsTo1(n-1);
            dp[n-1]=ans1;
        }
        else{
            ans1=dp[n-1];
        }
        int ans2=Integer.MAX_VALUE;
        if(n%2==0){
            if(dp[n/2]==-1){
                ans2=MinStepsTo1(n/2);
                dp[n/2]=ans2;
            }
            else{
                ans2=dp[n/2];
            }
            
        }
        int ans3=Integer.MAX_VALUE;
        if(n%3==0){
            if(dp[n/3]==-1){
        
            ans3=MinStepsTo1(n/3);
            dp[n/3]=ans3;
        }
            else{
                ans3=dp[n/3];
            }
        
    }
        return 1+Math.min(ans1, Math.min(ans2,ans3));
        }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
//        int res=MinStepsTo1(n);
//        System.out.println(res);
        int dp[]=new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        int resDP=minstepto1DP(n, dp);
        System.out.println(resDP);

    }
}
