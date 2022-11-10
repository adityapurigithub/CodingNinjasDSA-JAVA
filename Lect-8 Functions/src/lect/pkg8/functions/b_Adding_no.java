/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lect.pkg8.functions;

import java.util.Scanner;

/**
 *
 * @author Aditya
 */
public class b_Adding_no {
    public static int sum(int a, int b, int c){
        int add=a+b+c;
        return add;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int n3=s.nextInt();
        
        int ans1=sum(n1,n2,n3);
        System.out.println(ans1);
    }
    
}
