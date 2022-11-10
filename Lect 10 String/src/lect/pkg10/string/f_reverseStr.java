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
public class f_reverseStr {
    public static String reverseStr(String str){
        String revStr="";
        // 1st method..
//        for(int i=str.length()-1;i>=0;i--){
//            revStr+=str.charAt(i);
//            
//        }
//        return revStr;
    
        // 2nt method..
        for(int i=0;i<str.length();i++){
            revStr=str.charAt(i)+revStr;
            
        }
        return revStr;
                    
        }
        
        
    
    
    public static void main(String[] args){
        Scanner s=new Scanner (System.in);
        System.out.println("Enter the string..");
        String str=s.nextLine();
        String revStr=reverseStr(str);
        System.out.println(revStr);
        
        
    }
    
}
