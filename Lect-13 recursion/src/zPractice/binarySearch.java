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
public class binarySearch {
    public static int binarySearch(int arr[],int si,int ei,int x){
        if(si>ei){
            return -1;
        }
        int midElem=(si+ei)/2;
        if(arr[midElem]==x){
            return midElem;
        }
        else if(arr[midElem]<x){
            return binarySearch(arr,midElem+1,ei,x);
        }
        else{
            return binarySearch(arr,si,midElem-1,x);

        }
    }
    public static void main(String args[]){
        int arr[]= {1,2,3,4,5,6,7,8};
//        int bSearch=binarySearch(arr, 0, arr.length-1, 6);
//        System.out.println(bSearch);
        
        int bSearch=stillbinarySearch(arr, 0, arr.length-1, 60);
        System.out.println(bSearch);
        
        
    }

    private static int stillbinarySearch(int[] arr, int s, int e, int x) {
        if(arr.length==0 || s>e ){
            return -1;
        }
        int mid=(s+e)/2;
        if(arr[mid]==x){
            return mid;
        }
        
        else  if(x>arr[mid]){
            return  stillbinarySearch(arr, mid+1, e, x);
        }else{
            return  stillbinarySearch(arr, s, mid-1, x);

        }
    }
}
