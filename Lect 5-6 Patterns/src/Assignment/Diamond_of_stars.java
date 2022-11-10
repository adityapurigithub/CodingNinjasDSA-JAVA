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
public class Diamond_of_stars {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        int n1=(n+1)/2;
        int n2=n/2;
        //for diamond pattern we need to convert it into 2 halves..
        while(i<=n){
            int spaces=1;
            while(spaces<=n1-i){    
            System.out.print(" ");
            spaces++;
            }
            int star=1;
            while(star<=2*i-1){
                System.out.print('*');
                star++;
            }
//            while (spaces<=n2-i+1){
//                System.out.print(" ");
//                spaces++;
//            }
            int star1=1;
            while(star1<=2*i-1){
                System.out.print("*");
                star1++;
            
            }
            System.out.println();
            i++;
        }
    }
        
    
}
