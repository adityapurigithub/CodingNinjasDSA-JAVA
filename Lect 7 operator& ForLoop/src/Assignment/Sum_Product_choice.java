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
public class Sum_Product_choice {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=s.nextInt();
        int sum=0;
        int prod=1;
        for(int i=1;i<=n;i++){
            sum=sum+i;
            prod=prod*i;
           
        }
        if(c==1){
            System.out.println(sum);
        }
        else if(c==2){
            System.out.println(prod);
                    
        }
        else{
            System.out.println("-1");
                    }
    }
}
        

      