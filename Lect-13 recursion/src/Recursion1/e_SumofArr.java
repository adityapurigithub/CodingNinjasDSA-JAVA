/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion1;

import java.util.Scanner;

/**
 *
 * @author Aditya
 */
public class e_SumofArr {
    public static int sumArr(int arr[], int s){
        if(arr.length==0){
            return 0;
        }
        if(s==arr.length-1){
            return arr[s];
        }
        int smallSum=sumArr(arr, s+1);
       return arr[s]+smallSum;
    }
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        int arr[]=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=s.nextInt();
//            
//        }
            int arr[]={1,2,3,7,4,48,5};

//        System.out.print(sumArr(arr,0));
        int x=8;
        int ans=findX(arr,0,x);
        System.out.println("Element "+x+"present at index.."+ans);
        
        
    }

    private static int findX(int[] arr, int si,int x) {
        if(arr.length==0 || si==arr.length){
            return -1;
        }
        if(arr[si]==x){
            return si;
        }
        int smallArr=findX(arr,si+1,x);
        return smallArr;
        
        
    }
    
    
}
