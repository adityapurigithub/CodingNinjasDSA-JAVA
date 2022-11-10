
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
public class f_triangular_pattern1 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);  //creating Scanner
        int n=s.nextInt();  //taking n input from user
        int i=1;   //For printing rows..
        while(i<=n){           //loop to go through rows
            int j=1;   //for corresponding columns..
            while(j<=i){     //for ith row's
                System.out.print(j);
               
                j=j+1;
            }
        System.out.println();
        i=i+1;   //done with particular row and go to next..
    }
    
}
}
    

