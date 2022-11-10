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
public class printAllChars {
    public static void printAllChars(String str){
        int length=str.length();
        for(int i=0;i<length;i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args){
        String str="CODING IS EASY";
        printAllChars(str);
    }
}
