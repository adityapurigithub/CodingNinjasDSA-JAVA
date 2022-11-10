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
public class reverseStr {
    public static void reverseStr1(String str){
        int n=str.length();
        for(int i=n-1;i>=0;i--){
            char revChar=str.charAt(i);
            System.out.print(revChar);
        }
        
    }
    public static String reverseStr2(String str){
        int n=str.length();
        String revStr="";
        for(int i=0;i<n;i++){
            revStr=str.charAt(i)+revStr;
        }
        return revStr;
    }
  
  
    public static void main(String []args){
        String str="Legends Never Die";
        reverseStr1(str);
        System.out.println();
        String str2="They Are Immortals";
        String revStr=reverseStr2(str2);
        System.out.println(revStr);
    }
}

