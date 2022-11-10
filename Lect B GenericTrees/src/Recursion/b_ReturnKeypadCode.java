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
public class b_ReturnKeypadCode {
    public static String getOption(int dig){
        if(dig==2){
            return "abc";
        }
        if(dig==3){
            return "def";
        }
        if(dig==4){
            return "ghi";
        }
        if(dig==5){
            return "jkl";
        }
        if(dig==6){
            return "mno";
        }
        if(dig==7){
            return "pqrs";
        }if(dig==8){
            return "tuv";
        }
        if(dig==9){
            return "wxyz";
        }
        return "";
        
    }
    public static String[] KeypadCombination(int input){
        if(input==0){
            String[] op=new String[1];
            op[0]="";
            return op;
        }
        String[] smallop=KeypadCombination(input/10); // input/10 means...first 2 dig..(234 / 10 means 23)
        int lastdig=input%10;
        String lastdigitOption=getOption(lastdig);
        String[] Op=new String[smallop.length*lastdigitOption.length()];
        int k=0;
        for(int i=0;i<smallop.length;i++){
            for(int j=0;j<lastdigitOption.length();j++){
                Op[k]=smallop[i]+lastdigitOption.charAt(j);
                k++;
            }
        }
        return Op;
        
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no..");
        int input= s.nextInt();
        String [] st=KeypadCombination(input);
        for(String str:st){
            System.out.println(str);
        }
    }
}
