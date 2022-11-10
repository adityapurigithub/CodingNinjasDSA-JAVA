
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aditya
 */
public class b_Square_pattern {
      public static void main(String[] args){
        Scanner s=new Scanner(System.in);  //creating Scanner
        int n=s.nextInt();  //taking n input from user
        
        int i=1;   //For printing rows..
        while(i<=n){           //loop to go through rows
            int j=1;   //for corresponding columns..
            while(j<=n){     //loop to go through columns..
                System.out.print(i);
            j=j+1;
            }
        System.out.println();
        i=i+1;   //done with particular row and go to next..
    }
    
}
}