/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import java.util.Scanner;
public class Prime_no {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        boolean b = false;
        for (int i=2;i<=n;i++){
            // if(i/1==0 && i/i==0){
            //     System.out.println(i);
            // }
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    b = true;
                    break;
                } else {
                    b = false;
                    continue;
                }
            }
            
            if(b == false) {
               System.out.println(i); 
            }
            
        }
    }
}

		
	

