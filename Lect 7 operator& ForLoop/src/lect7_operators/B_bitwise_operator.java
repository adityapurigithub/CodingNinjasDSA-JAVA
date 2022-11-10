/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lect7_operators;

/**
 *
 * @author Aditya
 */
public class B_bitwise_operator {
    public static void main(String[] args){
        int a=10;
        int b=-20;
        //Bitwise And...
        System.out.println(a & b);
        //Bitwise OR
        System.out.println(a | b);
        //Bitwise Xor
        System.out.println(a ^ b);  //a^a=0   a^0=a
        //Bitwise complement
        System.out.println(~a);
        
          
         int x , y = 1;
         x = 10;
         if (x != 10 && x / 0 == 0)
             System.out.println(y);
         else
             System.out.println(++y);
    }
}
