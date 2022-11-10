/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lect9ArraySearching;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Aditya's PC
 */
public class a_linearSearch {
    public static void main(String[] args) {
        //taking input..
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array..");
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter elem at "+i+" index.");
            arr[i]=s.nextInt();
        }
//        printing arr.. easy way..
            System.out.println(Arrays.toString(arr));
            int atIndex=linearSearch(arr,77);
        System.out.println("found at.."+atIndex);
        
        Boolean ifElemPresent=linearSearchInStr("Aditya", 'x');
        System.out.println("Elem Present.."+ifElemPresent);
        
    }
    public static int linearSearch(int arr[],int elem){
        for(int a=0;a<arr.length;a++){
            if(arr[a]==elem){
                return a;
            }
        }
        return -1;
    }
        public static Boolean linearSearchInStr(String str,char elem){
            for(int x:str.toCharArray()){
                if(x==elem){
                    return true;
                }
            }
            return false;
        }
}
