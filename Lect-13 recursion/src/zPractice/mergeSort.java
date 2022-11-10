/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zPractice;

/**
 *
 * @author Aditya
 */
public class mergeSort {

    public static void merge(int s1[],int s2[],int d[]) {
        int i=0;
        int j=0;
        int k=0;
        while(i<s1.length &&  j<s2.length){
            if(s1[i]<=s2[j]){
                d[k]=s1[i];
                i++;
                k++;
            }
            else{
                d[k]=s2[j];
                j++;
                k++;
                
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
                j++;
                k++;
            }
            }
        }
    
    public static void mergeSort(int a[]) {
        //type void bCoz it will reflect changes in the given arr...
        if (a.length <= 1) {
            return;
        }
        int mid = a.length / 2;
        int b[] = new int[a.length / 2];
        int c[] = new int[a.length - b.length];

        for (int i = 0; i < mid; i++) {
            b[i] = a[i];
        }

        for (int i = mid; i < a.length; i++) {
            c[i-mid] = a[i];
        }
        mergeSort(b);
        mergeSort(c);
        merge(b,c,a);
    }

    public static void main(String args[]) {
        int arr[] = {4, 2, 6, 8, 9, 1, 2, 7};
        //        int mergeSortedArr[]=mergeSort(arr);
        mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
