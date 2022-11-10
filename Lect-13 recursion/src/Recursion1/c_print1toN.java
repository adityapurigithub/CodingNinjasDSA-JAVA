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
public class c_print1toN {
    public static void print1ton(int n){
        if(n==0){   //base case
            return;
        }
        print1ton(n-1);// Induction hypothesis
        System.out.println(n);  // induction step...
        
////// to print in reverse order 
//        System.out.println(n);
//        print1ton(n-1);  //here the functin calls like it print n...then n-1, n-2,....
    }
    public static void main(String[] args){
        print1ton(5);
    }
}
