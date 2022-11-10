/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import Stack.b1_stackUsingLL;

public class b2_StackUse {

    public static void main(String[] args) {
        b1_stackUsingLL<Integer> stack=new b1_stackUsingLL<>();
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            stack.push(arr[i]);
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        
        

    }
}
