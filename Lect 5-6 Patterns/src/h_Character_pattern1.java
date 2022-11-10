
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
public class h_Character_pattern1 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);  //creating Scanner
        int n=s.nextInt();  //taking n input from user
        
        int i=1;   //For printing rows..
        while(i<=n){           //loop to go through rows
            int j=1;   //for corresponding columns..
            while(j<=n){
                char jthChar=(char)('A'+j-1);  //Here Ascii value will be taken by system so we type caste it into char..
                System.out.print(jthChar);
                j=j+1;
            }
        System.out.println();
        i=i+1;   //done with particular row and go to next..
    }
    
}
}
    

