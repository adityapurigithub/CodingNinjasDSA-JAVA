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
public class zBalancedPranathesis {
    public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            String str=s.next();
            boolean check=isParanthesisBalanced(str);
            System.out.println(check);
    }

//    private static boolean isParanthesisBalanced(String str) {
//        Stack<Character>s=new Stack<>();
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i)=='[' || str.charAt(i)=='{' || str.charAt(i)=='(' ){
//                s.push(str.charAt(i));
//                continue;
//            }
//            if(s.isEmpty()){  //checking before peek pop that whether stack is empty or not
//                return false;
//            }
//                char check;
//            switch (str.charAt(i)){
//                case ']':
//                    check=s.pop();
//                    if(check=='{' ||check=='('){
//                        return false;
//                    }
//                    break;
//                    
//                   case '}':
//                    check=s.pop();
//                    if(check=='[' ||check=='('){
//                        return false;
//                    } 
//                    break;
//                    
//                    case ')':
//                    check=s.pop();
//                    if(check=='{' ||check=='('){
//                        return false;
//                    }
//                    break;
//                    
//            }
//        }
//        return (s.isEmpty());
//    }
    
    
        private static boolean isParanthesisBalanced(String str) {
            if(str.length()==0){
                return false;
            }
            Stack<Character> st=new Stack<>();
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='['){
                    st.push(str.charAt(i));
                    continue;
                }
                if(st.isEmpty()){
                    return false;
                }
                char check;
                switch(str.charAt(i)){
                    case ')':
                        check=st.pop();
                        if(check=='{' || check=='['){
                            return false;
                        }
                        break;
                        case '}':
                        check=st.pop();
                        if(check=='(' || check=='['){
                            return false;
                        }
                        break;
                        case ']':
                        check=st.pop();
                        if(check=='{' || check=='('){
                            return false;
                        }
                        break;
                }
                
            }
            return true;
        }
}

