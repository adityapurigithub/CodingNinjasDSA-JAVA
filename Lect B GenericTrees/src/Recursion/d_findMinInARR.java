/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author Aditya
 */
public class d_findMinInARR {
    public static int MinInArr(int a[],int startIndex){// RETURN THE VALUE AND DOES NOT PRINT
        if(startIndex==a.length){
            return Integer.MAX_VALUE;
        }
        int smallop=MinInArr(a, startIndex+1);
        if(a[startIndex]<smallop){
            return a[startIndex];
        }
        else{
            return smallop;
        }
    }
    
    public static void PrintMinInArr(int a[],int startIndex, int minSoFar){
        if(startIndex==a.length){
            System.out.println(minSoFar);
            return;
        }
        int min=minSoFar;
        if(a[startIndex]<minSoFar){
            min=a[startIndex];
        }
        PrintMinInArr(a, startIndex+1, min);
    }
    public static void main(String[] args){
        int[] a={13,2,5,4,6};
//        System.out.println(MinInArr(a, 0));
PrintMinInArr(a, 0, Integer.MAX_VALUE);
        
    }
    
}
