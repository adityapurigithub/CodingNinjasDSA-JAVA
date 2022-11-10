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
public class firstIndexLastIndexOfX {
    public static void main(String[] args) {
        int arr[]={1,3,2,4,2,3,2,6,7,3};
        int x=2;
        int firstIndex=firstIndexX(arr,0,x);
        System.out.println("First Index of X.."+firstIndex);
        
        
        int LastIndex=lastIndexBetter(arr,arr.length-1,x);
        System.out.println("Last Index of X.."+LastIndex);
    }

    private static int firstIndexX(int[] arr, int si,int x) {
        if(arr.length==0){
            return -1;
        }
        if(arr[si]==x){
            return si;
        }
        
        return firstIndexX(arr, si+1, x);
        
    }
        private static int lastIndexX(int[] arr, int li,int x) {
        if(arr.length==0){
            return -1;
        }
        if(arr[li]==x){
            return li;
        }
        
        return lastIndexX(arr, li-1, x);
        
    }
        private static int lastIndexBetter(int arr[],int si,int x){
            if(si==arr.length){
                return -1;
            }
            int smallAns=lastIndexBetter(arr, si+1, x);
            if(smallAns!=-1){
                return smallAns;
            }else{
                if(arr[si]==x){
                    return si;
                }else{
                    return -1;
                }
            }
            
        }
}
