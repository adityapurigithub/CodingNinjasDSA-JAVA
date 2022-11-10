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
public class parellelogramPattern {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            for(int i=1;i<=n;i++){
                if(i>1){ 
                for(int sp=1;sp<i;sp++){
                        //if we take if outside this loop its wrong..
                    System.out.print(" ");
                }
                }
                
                for(int j=1;j<=n;j++){
                    System.out.print("*");
                    
                }
                System.out.println();
            
        }
                            

    }
}
