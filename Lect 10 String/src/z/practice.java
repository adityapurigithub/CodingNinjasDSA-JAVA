/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z;

import java.util.Scanner;

/**
 *
 * @author Aditya
 */
public class practice {
    public static boolean reverseStr(String str) {
        String ans="";
        int n=str.length();
        for(int i=n-1;i>=0;i--){
            ans+=str.charAt(i);
        }
//        return ans;
        if(ans.equals(str)){
        return true;
        }else{
            return false;
        }
    }
    
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
//        String str=s.next();
        String str=s.nextLine();
        System.out.println(str);
        boolean rev=reverseStr(str);
        System.out.println(rev);
        
    }

    
}
