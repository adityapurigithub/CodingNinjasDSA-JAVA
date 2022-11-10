/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lect.pkg10.string;

/**
 *
 * @author Aditya
 */
public class b_SubstringFunc {
    public static void main(String[] args){
 // A part of String is called substring.
// In other words, substring is a subset of another String.       
        String s1="CODING NINJA";
        String substr=s1.substring(0);
        System.out.println(substr);
        
        String substr1=s1.substring(0,2); // start(0) is including and end(2) is not including
        System.out.println(substr1);
        
        String substr2=s1.substring(4);
        System.out.println(substr2);
        
        String substr3=s1.substring(4,8);  // srt form 4 to 7 will printed..
        System.out.println(substr3);
    }
}
