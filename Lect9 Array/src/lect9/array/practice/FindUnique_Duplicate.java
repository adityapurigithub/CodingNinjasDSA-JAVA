/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lect9.array.practice;

/**
 *
 * @author Aditya
 */
public class FindUnique_Duplicate {
    public static int findUnique(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                return arr[i+1];
            }
        }
        return 0; //no unique
    }
    
    public static int findDuplicate(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n;j++)
            if(arr[i]==arr[j]){
                return arr[i];
            }
        }
        return 0; //no duplicate
    }
    public static void main(String[] args){
        int arr[]={1,1,1,44,1,1};

        int arr2[]={4,2,3,4,5,1};

        int unique=findUnique(arr);

        int duplicate=findDuplicate(arr2);

        System.out.println(unique);

        System.out.println(duplicate);
    }
}
