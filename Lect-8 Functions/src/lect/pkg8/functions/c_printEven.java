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
public class c_printEven {
    public static void evenNo(int n){
    
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
           
        }
       
    }
        public static void main(String[] args){
            Scanner s=new Scanner(System.in);
            int num=s.nextInt();
            evenNo(num);
            
            
        }
}
 
