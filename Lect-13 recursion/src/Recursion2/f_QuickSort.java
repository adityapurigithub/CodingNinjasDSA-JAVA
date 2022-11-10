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
public class f_QuickSort {
    public static int partition(int a[],int si,int ei){
        int pivotElement=a[si];
        int smallNoCount=0;
        for(int i=si;i<=ei;i++){
            if(a[i]<pivotElement){
                smallNoCount++;
            }
        }
        int temp=a[si+smallNoCount];
        a[si+smallNoCount]=pivotElement;
        a[si]=temp;
        
        int i=si;
        int j=ei;
        while(i<j){
            if(a[i]<pivotElement){
                i++;
            }
            else if(a[j]>=pivotElement){
                j--;
            }
            else{
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;j++;
            }
        }
        return si+smallNoCount;
        
    }
    public static void quickSort(int input[],int si,int ei){
        if (si>=ei){
            return;
        }
        int pivotIndex=partition(input,si,ei);
        quickSort(input, si, pivotIndex-1);
        quickSort(input, pivotIndex+1,ei);
    }
    public static void main(String[] args){
        int a[]={10,4,5,9,8,1,2,3,5,11,12,666};
        quickSort(a, 0, a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    
}
