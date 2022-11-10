/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lect.pkg10.string;

import java.util.*;

/**
 *
 * @author Aditya
 */
public class e_countWords {
    public static int countWords(String str){
        int words=0;
        str=str.trim();  //remove all white space before and after the string..
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                words+=1;
            }
        }
        return words+1;
    }
        
    
    public static void main(String [] args){
        Scanner s=new Scanner (System.in);
        String str=s.nextLine();
        System.out.println(countWords(str));
}
}
