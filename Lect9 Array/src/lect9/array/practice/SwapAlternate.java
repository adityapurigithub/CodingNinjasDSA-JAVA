/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lect9.array.practice;

/**
 *
 * @author Aditya
 */
public class SwapAlternate {
    public static void swapAlternate(int arr[]){
        int n=arr.length;
        int temp=Integer.MIN_VALUE;
            for(int i=0;i<n-1;i+=2){
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                
            }
    }
    public static void main(String[] args){
        int arr[]={1,4,12,55,22,4,63,5,6};
        swapAlternate(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
}
