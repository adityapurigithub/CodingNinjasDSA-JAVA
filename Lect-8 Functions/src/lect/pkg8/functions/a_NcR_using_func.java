/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lect.pkg8.functions;

import java.util.Scanner;

/**
 *
 * @author Aditya
 */
public class a_NcR_using_func {
//
//Creating functions...
//    public static output-type func-name(input-parameter)
    
    public static int fact(int num){   //public static same for each func...int is the output we expecting
                                             // fact is the name of function ... 
                                               //int num is the integer variable for which we are calculating fact..
         int fact =1;
         for (int i=1;i<=num;i++){
             fact*=i;
         }
         return fact;
    }        // function end here
    
    //about VOID..
    /*The functions which doesn't return any value, their return type is "void".*/
    
    
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int r=s.nextInt();
        
        int factN=fact(n);
        int factR=fact(r);
        int factNR=fact(n-r);
        
        int ans=factN/(factR*factNR);
        System.out.println(ans);
        
    }
    
}


