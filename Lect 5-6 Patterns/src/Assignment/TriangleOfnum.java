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
public class TriangleOfnum {
    public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n){
            int space=1;
            while(space<=n-i){
                System.out.print(" ");
                space++;
           
            }
            int inc=i;
            int t=1;
            while(t<=i){
                System.out.print(inc);
                inc++;
                t++;
            }
            //for decreasing part...
            int dec=inc-2;
            t=i-1;
            while (t>0){
                System.out.print(dec); //some error here
                dec=dec-1;
                t--;
            }
            //...dec part
            
            System.out.println();
            i++;
        }
    }
}


