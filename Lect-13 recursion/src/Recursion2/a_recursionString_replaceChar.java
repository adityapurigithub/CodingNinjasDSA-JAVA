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
public class a_recursionString_replaceChar {
    public static String replaceChar(String s,char aOrg,char bRep){
        //base case.. in string is like this..
        if(s.length()==0){    
            return s;
        }
        
            //induction hypothesis..recursion starts...
        String smallOutput=replaceChar(s.substring(1), aOrg, bRep);
        if(s.charAt(0)==aOrg){
            return bRep+smallOutput;
        }
        else{
            return s.charAt(0)+smallOutput;
        }
        
    }
    public static void main(String args[]){
        System.out.println(replaceChar("adityapuri", 'a', '@'));
    }
}
