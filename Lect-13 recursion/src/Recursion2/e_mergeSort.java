/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion2;

/**
 *
 * @author Aditya
 */
public class e_mergeSort {
    public static void merge(int s1[], int s2[],int d[]){
        int i=0;
        int j=0;
        int k=0;
        while(i<s1.length && j<s2.length){
            if(s1[i]<=s2[j]){
                d[k]=s1[i];
                i++;
                k++;
            }
            else{
                d[k]=s2[j];
                k++;j++;
            }
        }
        if(i<s1.length){
            while(i<s1.length){
                d[k]=s1[i];
                i++;
                k++;
            }
        }
        if(j<s2.length){
            while(j<s2.length){
                d[k]=s2[j];
                k++;
                j++;
            }
        }
    }
    public static void mergeSort(int arr[]){
        int n=arr.length;
        if(n<=1){
            return;
        }
        int b[]=new int[n/2];
        int c[]=new int[n-b.length];

        for(int i=0;i<n/2;i++){
            b[i]=arr[i];
        }
        for(int i=n/2;i<n;i++ ){
            c[i-n/2]=arr[i];
        }
        mergeSort(b);
        mergeSort(c);
        merge(b,c,arr);

    }
    public static void main(String []args){
        int arr[]={10,4,5,9,8,6,12,11,7};
        mergeSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
