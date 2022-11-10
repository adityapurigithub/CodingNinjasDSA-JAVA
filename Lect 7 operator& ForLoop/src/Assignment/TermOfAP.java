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

//Solved in my way

public class TermOfAP {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
           int x= 3*i+2;
//           System.out.print(x+" ");        

        if(x%4==0){
            n=n+1;    //when the x term is divisible by 4, n increment and hence next value will be checked..
                
        }
        else{
            System.out.print(x+" ");
        }
        }
        
    }
}
