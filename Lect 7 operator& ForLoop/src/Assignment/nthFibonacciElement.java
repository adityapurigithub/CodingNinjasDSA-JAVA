/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import java.util.Scanner;

/**
 *
 * @author Aditya
 */
public class nthFibonacciElement {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0;
        int b=1;
        int c=0;
        for (int i=1;i<=n;i++){
           
                c=a+b;
                a=b;
                b=c;
                
                
            }
        System.out.print(a);
        }
}
   
