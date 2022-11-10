/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lect9.array;

import java.util.Scanner;

/**
 *
 * @author Aditya
 */
public class b_inputofArray_printing {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter element for "+i+"th index");
            arr[i]=s.nextInt();// taking input for ith index value from user...
        }
                    System.out.println();

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
