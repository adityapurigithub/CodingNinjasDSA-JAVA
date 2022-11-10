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
public class d_minNoofSq {

    public static int MinNoOfSq(int n, int dp[]) {
        //O(n*n^1/2)..n*root(n)..for n no of call and each call taking root n time
        if (n == 0) {
            return 0;
        }
        int minAns = Integer.MAX_VALUE;
        for (int i = 1; i * i <= n; i++) {
            int currAns;

            if (dp[n - (i * i)] == -1) {

                currAns = MinNoOfSq(n - (i * i), dp);
                dp[n - (i * i)] = currAns;
            } else {
                currAns = dp[n - (i * i)];
            }
            if (minAns > currAns) {
                minAns = currAns;
            }
        }
        int myAns = 1 + minAns;

        return myAns;
    }

    public static int MinNoofSqIterative(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            int minAns = Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++){
                int currAns=dp[i-(j*j)];    
                if(minAns>currAns){
                    minAns=currAns;
                }
            }
            dp[i]=1+minAns;

        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
                // for recursive 

//        int dp[] = new int[n + 1];
//        for (int i = 0; i < dp.length; i++) {
//            dp[i] = -1;
//        }
//
//        int ans = MinNoOfSq(n, dp);
//        System.out.println(ans);
        
        //for iterative method..
        int ans=MinNoofSqIterative(n);
        System.out.println(ans);
        
    }
}
