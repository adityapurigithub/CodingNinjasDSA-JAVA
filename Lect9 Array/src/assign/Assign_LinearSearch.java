/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign;

import java.util.Scanner;

/**
 *
 * @author Aditya
 */
public class Assign_LinearSearch {
        public static int[] take_input(){    //int arr[] is the return type for int array
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }
    public static int linearSearch(int arr[], int x) {
        for (int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
                
            }
        }
        return -1;
    }
public static void main(String[]args){
       for(int i=0; i<n; i++){
            if(n%2==0){
                for(int j=1;j<n/2;j++){
                    System.out.print(j);
                    j+=2;
                }
                else{
                    for(int j=1;j<=(n-1)/2;j++){
                    System.out.print(n);
                    n-=2;
                }
                    
                }
    }
}

