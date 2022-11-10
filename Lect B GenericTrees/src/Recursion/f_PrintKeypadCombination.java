/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.Scanner;

/**
 *
 * @author Aditya
 */
public class f_PrintKeypadCombination {
    public static String getOptions(int num){
        if(num==2){
            return "abc";
        }if(num==3){
            return "def";
            
        }if(num==4){
            return "ghi";
            
        }if(num==5){
            return "jkl";
            
        }if(num==6){
            return "mno";
            
        }if(num==7){
            return "pqrs";
            
        }if(num==8){
            return "tuv";
            
        }
        if(num==9){
            return "wxyz";
            
        }
        return "";
    }
    public static void PrintkeypadCombination(int input,String sofar){
        if(input==0){
            System.out.println(sofar);
            return;
        }
        int lastDig=input%10;
        int smallInput=input/10;
        String optionsLastdig=getOptions(lastDig);
        for(int i=0;i<optionsLastdig.length();i++){
            PrintkeypadCombination(smallInput, optionsLastdig.charAt(i)+sofar);
        }
    }
    
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        PrintkeypadCombination(n, "");
    }
    
}
