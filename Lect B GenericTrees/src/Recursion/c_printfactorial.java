/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.Scanner;

/**
 *
 * @author Aditya
 */
public class c_printfactorial {
    public static int factorial(int n){  // here we are returning the factorial...
        if(n==1){
            return 1;
        }
        int smallop=factorial(n-1);
        int ans=n*smallop;
        return ans;
    }
    
    public static void FactorialPrintFunc(int n,int ans){  //here while going down to the base case
                           // we are calculating the ans and at base case the final ans get printed...
        if(n==0){
            System.out.println(ans);
            return;
        }
        ans=ans*n;
        FactorialPrintFunc(n-1, ans);
        
        
    }
    
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a no to find factorial..");
        int num=s.nextInt();
        //System.out.println(factorial(num));
        FactorialPrintFunc(num, 1);
        
        
    }
}
