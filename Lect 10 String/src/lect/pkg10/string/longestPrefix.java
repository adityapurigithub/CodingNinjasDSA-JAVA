/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lect.pkg10.string;

/**
 *
 * @author Aditya's PC
 */
public class longestPrefix {
    public static void main(String[] args) {
        String str[]={"flower","flow","flat"};
        String res=longestPrefixInstrArr(str);
        System.out.println(res);
//        System.out.println("flow".indexOf("flow"));
        
    }
    public static String longestPrefixInstrArr(String str[]){
        String first=str[0];
        for(int i=1;i<str.length;i++){
            while(str[i].indexOf(first)!=0){
               first= first.substring(0, first.length()-1);
               continue;
            }
        }
        return first;
    }           
}
