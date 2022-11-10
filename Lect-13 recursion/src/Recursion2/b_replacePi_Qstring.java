/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion2;

/**
 *
 * @author Aditya
 */
public class b_replacePi_Qstring {
    public static String repPi(String s){
        if (s.length()<=1){
            return s;
        }
        if(s.charAt(0)=='p' && s.charAt(1)=='i'){
            //call recursion on len n-2
            String smallop=repPi(s.substring(2));
            return "3.14"+smallop;
        }
        else{
            //call recursion on string len of n-1
            String smallop=repPi(s.substring(1));
            return s.charAt(0)+smallop;
        }
    }
    public  static void main(String[] args){
        System.out.println(repPi("pperpipae"));
    }
}
