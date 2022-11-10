/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zPractice;

/**
 *
 * @author Aditya's PC
 */
public class removeConsecutiveDuplicately {
    public static void main(String[] args) {
        String s="aabccbbccd";
        
        String solved=removeDuplicateRecursively(s);
        System.out.println(solved);
    }

    private static String removeDuplicateRecursively(String s) {
        if(s.length()<=1){
            return s;
        }
        if(s.charAt(0)==s.charAt(1)){
            return s.charAt(0)+removeDuplicateRecursively(s.substring(2));
        }else{
            return s.charAt(0)+removeDuplicateRecursively(s.substring(1));
        }
        
    
    }
            
}
