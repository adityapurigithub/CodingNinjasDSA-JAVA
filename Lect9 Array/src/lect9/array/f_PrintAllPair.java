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
public class f_PrintAllPair {
    public static void print_allpair(int []arr){
        int n=arr.length;
        System.out.println("Pairs are...");

        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                System.out.println("("+arr[i]+","+arr[j]+")");
            }
        } 
    }
    
    public static void main(String[]args){
        int arr[]={1,4,2,5,6,8};
        print_allpair(arr);
    }
    
}
