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
public class d_BinarySearch {
    public static int binarySearch(int arr[],int si,int ei,int x){
        //base case..
        if(si>ei){    // array should be sorted in binary search..
            return -1;
        }
        int midIndex=(si+ei)/2;
        if(arr[midIndex]==x){
            return midIndex;
        }
        // recusion call ...
        else if(x>midIndex){
            return binarySearch(arr, midIndex+1, ei, x);
            
        }
        else{
            return binarySearch(arr, si, midIndex-1, x);
        }
        
    }
    public static void main(String [] args){
        int arr[]={1,2,3,4,5,6,7,8};
        System.out.println(binarySearch(arr, 0, arr.length-1, 5));
    }
    
}
