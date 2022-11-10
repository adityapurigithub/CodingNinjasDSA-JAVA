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
public class e_PrintSunbsequence {
   

// REMEMBER ALways...Subsequence and substring's maximum Problems are solved using recursion

    public static String[] subsequence(String input){  // aabbcc
        if(input.length()==0){
            //base case
            String [] output=new String[1];
            output[0]="";
            return output;
        }
        String[] smallOp=subsequence(input.substring(1));   //abbcc
        String[] output=new String[(smallOp.length*2)];
        for(int i=0;i<smallOp.length;i++){
            output[i]=smallOp[i];
        }
        for(int i=0;i<smallOp.length;i++){  // appending the 0th char...
            output[smallOp.length+i]=input.charAt(0)+smallOp[i];
        }
        return output;
        
    } 
    
    
public static void Printsubsequence(String input,String soFar){
        if(input.length()==0){
            System.out.println(soFar);
            return;
        }
        Printsubsequence(input.substring(1), soFar);
        Printsubsequence(input.substring(1), soFar+input.charAt(0));
        
        
    }
    
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String..");
        String str=s.next();
        Printsubsequence(str, "");
   }
}

    

