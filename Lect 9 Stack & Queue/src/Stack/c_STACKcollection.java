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

import java.util.Stack;//import stack for using stack Collection
public class c_STACKcollection {
    public static void main(String[] args){
        Stack<Integer> stack=new Stack<>();
//        stack.push(0);
//        System.out.println(stack);
//        System.out.println(stack.size());
//        stack.push(5);
//        stack.push(10);
//        stack.push(15);
//        System.out.println(stack.pop()+stack.size());
//        
//        for(int i=0;i<10;i++)
//        {
//            stack.push(i*2);
//        }
//        System.out.println(stack.peek());
//        
//        
         while(stack.isEmpty())
        {
            stack.push(10);
        }
        System.out.println(stack.pop()+" "+stack.size());
    
    }
    }
    

