/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion1;

/**
 *
 * @author Aditya
 */
public class d_fibonacci {
    public static int fibN(int n){
        //base case...
        if(n==1 || n==2){   // if base case is missing in a code the it will give stack overflow
            return 1;
        }
        int fibn_1=fibN(n-1);
        int fibn_2=fibN(n-2);
        int ans=(fibn_1)+(fibn_2);
        return ans;  // 5th fibonacci no...will be return
    }
    public static void main(String[] args){
        System.out.println(fibN(5));
    }
    
}
