
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
public class g_triangular_pattern2 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);  //creating Scanner
        int n=s.nextInt();  //taking n input from user
        
        int i=1;   //For printing rows..
        while(i<=n){           //loop to go through rows
            int p=i;
            int j=1;   //for corresponding columns..
            while(j<=i){     //for ith row's
                System.out.print(p); //also without taking p ..simply print (i+j-1)
                p=p+1;
                j=j+1;
            }
        System.out.println();
        i=i+1;   //done with particular row and go to next..
    }
    
}
}
    

