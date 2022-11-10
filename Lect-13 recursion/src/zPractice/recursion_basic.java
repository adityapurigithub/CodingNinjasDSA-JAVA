/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zPractice;

import java.util.Scanner;

/**
 *
 * @author Aditya
 */
public class recursion_basic {

    public static int sumN(int n) {
        //base case.....
        if (n == 0) {
            return n;
        }
        //induction hypothesis...assumption..
        int smallOp = sumN(n - 1);

        //induction step...small ans''
        int ans = smallOp + n;
        return ans;
    }

    public static void printN(int n) {
        if (n == 0) {
            return;
        }
        //for reverse order wirte print statement here...
        printN(n - 1);
        System.out.print(n);//
    }

    public static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int fibn1 = fib(n - 1);
        int fibn2 = fib(n - 2);

        int ans = fibn1 + fibn2;
        return ans;
    }

    public static boolean isSorted(int arr[]) {
        if (arr.length == 1) {
            return true;
        }
        if (arr[0] > arr[1]) {
            return false;
        }
        int smallarr[] = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            smallarr[i - 1] = arr[i];
        }
        boolean isSmallArrSorted = isSorted(smallarr);
        return isSmallArrSorted;

    }

    public static boolean issortedBetter(int arr[], int si) {  //in this we dont create new arr copies...
        if (si == arr.length - 1) {
            return true;
        }
        if (arr[si] > arr[si + 1]) {
            return false;
        }
        boolean issmallArrSorted = issortedBetter(arr, si + 1);
        return issmallArrSorted;

    }

    public static boolean noInArr(int arr[], int i, int n) {
        if (arr[i] == n) {
            return true;
        }
        if (i == arr.length - 1) {
            return false;
        }
        boolean ans = noInArr(arr, i + 1, n);
        if (ans == true) {
            return true;
        } else {
            return false;
        }
    }

    public static int firstIndexOfArr(int arr[], int x) {
        if (arr.length == 0) {
            return -1;
        }
        if (arr[0] == x) {
            return 0;
        }
        int smallArr[] = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            smallArr[i-1] = arr[i];
        }
        int ans = firstIndexOfArr(smallArr, x);
        if (ans == -1) {
            return -1;
        } else {
            return ans + 1;//
        }
    }
    public static int firstIndexOfArrBetter(int arr[], int x,int i){
        if(arr[i]==x){
            return i;
        }
        if(i==arr.length){
            return -1;
        }
        int ans=firstIndexOfArrBetter(arr, x, i+1);
        return ans;
    } 
    
    public static int lastIndexOfArr(int arr[],int x){
        if(arr.length==0){
            return -1;
        }
        int smallArr[]=new int[arr.length-1];
        for(int i=1;i<arr.length;i++){
            smallArr[i-1]=arr[i];
        }
        int lI=lastIndexOfArr(smallArr,x);
        if(lI!=-1){
            return lI+1; 
        }else if(arr[0]==x){
                return 0;
            }else{
                return -1;
            }
        }
    public static int lastIndexInArrBetter(int arr[],int i,int x){
        if(i==arr.length){
            return -1;
        }
        int lI=lastIndexInArrBetter(arr, i+1, x);
        if(lI!=-1){
            return lI;
        }else if(arr[i]==x){
            return i;
        }else{
            return -1;
        }
    }
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();

//        int ans=sumN(n);
//        System.out.println(ans);
//        
//        printN(n);
//        int fib=fib(n);//return the nth fibonacci no..
//        System.out.println(fib);
        int arr[] = {1, 2, 4, 5, 6,5,3,5};
//          boolean array=issortedBetter(arr,0);
//          System.out.println(array);
//        boolean noinarr = noInArr(arr, 0, 2);
//        System.out.println(noinarr);

//        int fi=firstIndexOfArr(arr, 5);
//        int fiBetter=firstIndexOfArrBetter(arr, 5,0);

//        int li=lastIndexOfArr(arr, 5);
        int li=lastIndexInArrBetter(arr, 0,5);
         System.out.println(li);
    }

}
