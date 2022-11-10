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
public class C_left_right_shift {
    public static void main(String[] args){
        //   << means left shift..  it works as doubling the value
        int a=10;
        int lshf=a << 1;
        System.out.println(lshf);
        //  >> right shift...works as value get halved
        int rshf=a>>1;
        System.out.println(rshf);
    }
}
