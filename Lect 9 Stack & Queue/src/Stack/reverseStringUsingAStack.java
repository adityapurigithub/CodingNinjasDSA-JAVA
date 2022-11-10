/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Aditya's PC
 */
public class reverseStringUsingAStack {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        String str=s.next();
        Stack<Character> st=new Stack<>();
        
        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }
        
        System.out.println("String Reversed using Stack..");
        while(!st.isEmpty()){
            System.out.print(st.pop());
        }
        
    }
}
