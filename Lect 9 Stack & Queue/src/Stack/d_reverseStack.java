/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author Aditya
 */
import java.util.Stack;
public class d_reverseStack {  // we use recursion because recursion itself use a stack 
                       //  and here we need an implict stack
    
    private static void reverseStack(Stack<Integer> st, Stack<Integer> extra) {
        if(st.isEmpty()){
            return;
        }
        int temp=st.peek();  //after each call.the value of temp ...this is stored in recursion stack..
        st.pop();
        reverseStack(st, extra);
        while(st.size()!=0){
            extra.push(st.pop());
        }
        st.push(temp);
        while(extra.size()!=0){
            st.push(extra.pop());
        }
        
    }
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        Stack<Integer> extra=new Stack<>();
        
        int []arr={1,2,3,4,5};
        for(int elem:arr){
            st.push(elem);
        }
        reverseStack(st,extra);
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }

    
}
