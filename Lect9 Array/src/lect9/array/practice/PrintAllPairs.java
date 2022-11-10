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
public class PrintAllPairs {
    public static void printAllPairs(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
            System.out.println("{ "+arr[i]+arr[j]+" }");
            }
        }
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6};
        printAllPairs(arr);
    }
}
