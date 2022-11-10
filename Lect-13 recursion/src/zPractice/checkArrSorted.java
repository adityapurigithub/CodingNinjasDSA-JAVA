/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zPractice;

/**
 *
 * @author Aditya's PC
 */
public class checkArrSorted {
    public static void main(String[] args) {
        int arr[]={1,3,2,4,5,6,7};
        boolean sorted=checkSorted(arr, 0 );
        System.out.println("Is sorted?? "+ sorted);
    }

    private static boolean checkSorted(int[] arr, int s) {
        if(s==arr.length-1){
            return true;
        }
        if(arr[s]>arr[s+1]){
            return false;
        }
//        int smallArr[]=new int[arr.length-1];
//        for(int i=0;i<smallArr.length;i++){
//            smallArr[i]=arr[i+1];
//        }
        
        boolean smallArrSorted=checkSorted(arr,s+1);
        return smallArrSorted;
        
        
    }
}
