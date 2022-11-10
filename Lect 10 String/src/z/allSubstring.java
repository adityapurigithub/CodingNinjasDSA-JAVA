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
public class allSubstring {
    public static void allSubstring(String str){
        int n=str.length();
        if(n<=1){
            return;
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.println(str.substring(i,j+1));
        }
        }
    }
    public static void main(String [] args){
        String str="Success";
        allSubstring(str);
    }
}
