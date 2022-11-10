/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lect9.array;

/**
 *
 * @author Aditya
 */
public class a_BAsicOfArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaring an array
        int arr[]=new int[5];  //here we declare an array a of type int with size 5
        arr[0]=3;
        arr[3]=13;
        System.out.println(arr[0]);
        System.out.println(arr[3]);
        System.out.println(arr[1]);  //here we dont have any integer at index 1 so it wuill print 0..
        
        char charr[]=new char[9];
        double darr[]=new double[10];
        
        System.out.println(charr[0]);//dont have any element at this index so print NULL character
        System.out.println(darr[0]); //here we dont have any element at this index so it will print 0.0
        
        System.out.println();
        
        
        
    }
    
}
