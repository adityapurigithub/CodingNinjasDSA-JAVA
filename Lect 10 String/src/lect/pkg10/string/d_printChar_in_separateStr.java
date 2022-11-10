/*
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
public class d_printChar_in_separateStr {
    public static void printchar(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
        
    }
    public static void main(String [] args){
        Scanner s=new Scanner (System.in);
        String str=s.nextLine();
        printchar(str);
    }
}
