package lect9ArraySearching;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aditya
 */
public class b_SelectionSort {
    public static void printarr(int arr[]){
        int n=arr.length;
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        
    }
        public static void selectionsort(int arr[]){
                int n=arr.length;
                for(int i=0;i<n-1;i++){
                    int min=Integer.MIN_VALUE;
                    int minIndex=-1;
                    for(int j=i;j<n;j++){
                        if(arr[j]<min){
                            min=arr[j];
                            minIndex=j;
                        }
                    }    
                    int temp=arr[minIndex];
                    arr[minIndex]=arr[i];
                    arr[i]=temp;
                }
        }
public static void main(String[] args){
        int arr[]={2,5,4,1,4,7,9,3};
        selectionsort(arr);
        printarr(arr);
    }
    
}


