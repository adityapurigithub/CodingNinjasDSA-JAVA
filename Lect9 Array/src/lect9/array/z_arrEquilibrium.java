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
public class z_arrEquilibrium {
    public static int[] input_arr(){    //int arr[] is the return type for int array
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the "+i+"th element");
            arr[i]=s.nextInt();
        }
        return arr;
    }
    	public static int arrayEquilibriumIndex(int[] arr){  
            int n=arr.length;
            int tsum=0;
            int lsum=0;
            int rsum=0;
            for(int i=0;i<n;i++){
                tsum+=arr[i];
                lsum+=arr[i];
                rsum=tsum-lsum-arr[i+1];
                if(lsum==rsum){
                    return i;
                }
        }
            return 0;
            
            
        }
    
    public static void print_arr(int arr[]){
        int n=arr.length;
        System.out.print("Array is...");
        for (int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[]args){
        
        int arr[]=input_arr();
        print_arr(arr);
        arrayEquilibriumIndex(arr);
    }
}