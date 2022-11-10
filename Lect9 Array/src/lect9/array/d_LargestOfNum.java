package lect9.array;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aditya
 */
public class d_LargestOfNum {
    public static int[] input_arr(){    //int arr[] is the return type for int array
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element at "+i+" index");
            arr[i]=s.nextInt();
        }
        return arr;
    }
    public static int largest_arr(int arr[]){
        int max=Integer.MIN_VALUE;
        
        
        System.out.print("LARGEST ELEMENT IN ARRAY IS..");
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
            max=arr[i];
        }}
        return max;
    
    }
public static void main(String[]args){
        int arr[]=input_arr();
        int lar=largest_arr(arr);
        System.out.println(lar);
    }
}

