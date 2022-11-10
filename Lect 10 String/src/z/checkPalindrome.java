/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z;

/**
 *
 * @author Aditya
 */
public class checkPalindrome {
    public static boolean checkPalindrome(String str){
        int n=str.length();
        if(n==1){
            return true;
        }
        String revStr="";
        for(int i=0;i<n;i++){
            revStr=str.charAt(i)+revStr;
            System.out.println(revStr+i);
        }
        if(str.toLowerCase().equals(revStr.toLowerCase())){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String [] args){
        String str="abba";
        boolean isPalindrome= checkPalindrome(str);
        System.out.println(isPalindrome);
    }
}
