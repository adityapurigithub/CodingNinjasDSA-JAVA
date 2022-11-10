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
/*things to remeber...
   to find last digit of a no is done by...n%10
        then spit remain as n/10...
        */
public class ReverseOfNo {
    public static void main(String[] args){
        
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int revnum=0;
        while(n>0){
            int lastdig=n%10;
            revnum=revnum*10 + lastdig;  //to find reverse..
            n=n/10;
        }
        System.out.print(revnum);
    }
}
