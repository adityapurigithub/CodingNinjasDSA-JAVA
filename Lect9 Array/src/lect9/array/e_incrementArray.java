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
public class e_incrementArray {
    
    public static void print_arr(int arr[]){
         int n=arr.length;
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
            
    }
    public static void inc_arr(int arr[]){
       
        for(int i=0;i<arr.length;i++){
            arr[i]+=1;
            
        }
        
    }
    
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        inc_arr(arr);
        print_arr(arr);
    }
    
}
