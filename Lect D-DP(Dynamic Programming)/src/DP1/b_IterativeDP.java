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
public class b_IterativeDP {
//    in iteraive way approach acc to recursion...
    public static int FibbIterative(int n){  // time... O(n)   space...O(n) 
        if(n==0||n==1){    //BASE CASE REMAIN SAME....
            return n;
        }
        
        int []dp=new int[n+1];   //will create a arr of size N+1
        dp[0]=0;
        dp[1]=1;   //initialize its value acc to base case...
        
        // now n>=2...Iteration starts..
        for(int i=2;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2];   // using recurrence realtion we find out this...
        }
        
        return dp[n];
    }
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ans=FibbIterative(n);
        System.out.println(ans);
    }
}
