/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lect7_forLoop;

/**
 *
 * @author Aditya
 */
public class b_FabonaciAssign1 {
    public static void main(String[] args){
        int n=10;
        int a=0;
        int b=1;
        int c=0;
        for(int i=1;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(a);

        }
//        System.out.println(a);
    }
}