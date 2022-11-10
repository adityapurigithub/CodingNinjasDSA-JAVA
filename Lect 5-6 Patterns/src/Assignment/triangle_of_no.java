package Assignment;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Aditya
 */
public class triangle_of_no {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n){
            int space=1;
            while(space<=n-i){
                System.out.print(" ");
                space++;
           
            }
            int inc=1;
            while(inc<=i){
                System.out.print(inc+i-1);
                inc++;
            }
            //for decreasing part...
            int dec=i-1;
            while (dec>=1){
                
                System.out.print((2*i)-2);
                dec=dec-1;
            }
            //...dec part
            
            System.out.println();
            i++;
        }
    }
}
