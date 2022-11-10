m/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lect.pkg10.string;

import java.util.Scanner;

/**
 *
 * @author Aditya
 */
public class c_StringInput {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
        String str=s.next();  // it will only give the first string...
        String str1=s.next();
        }
        String str1=s.next();  // it return the second string similary next will return 3rd string.....
        System.out.println(str1+ " "+str1.length());
        
        String str3=s.nextLine();  // it return the whole string or everthing after the previous string..
        System.out.println(str3+ " "+str3.length());
    
    
    
    }
    
}
