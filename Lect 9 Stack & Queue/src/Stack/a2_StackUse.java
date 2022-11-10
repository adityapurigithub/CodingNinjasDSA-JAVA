/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import Stack.a1_StackUsingArr;

public class a2_StackUse {

    public static void main(String[] args) {
        a1_StackUsingArr st = new a1_StackUsingArr();
//        System.out.println(st.push(10));
//        System.out.println(st.push(20));
//        System.out.println("Size.." + st.size());
//        System.out.println("At top.." + st.top());
//        System.out.println("Poping.." + st.pop());
//        System.out.println("Pusinh ..." + st.push(30));
//        System.out.println("Size.." + st.size());
//        System.out.println("AtTop.." + st.top());
//        System.out.println("Checking stack empty or not.." + st.isEmpty());
        ////
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            st.push(arr[i]);
        }
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
        
        b1_stackUsingLL

    }
}
