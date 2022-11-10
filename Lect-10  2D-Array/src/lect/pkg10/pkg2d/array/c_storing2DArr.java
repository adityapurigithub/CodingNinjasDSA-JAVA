/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lect.pkg10.pkg2d.array;

/**
 *
 * @author Aditya
 */
public class c_storing2DArr {
    public static void main(String[] args){
        int arr[][]={{1,2,3,4},{4,8,12,16},{2,4,6,8}};  // here 3 row and 4 columns..
        System.out.println(arr); //it tells the reference of arr
            // 2d arr basically are the reference of array...
            //   means single dimensional array reference is stored as a reference of arrays... 
               // 
        System.out.println(arr.length);   //output will be 3 because 3 array are stored as a reference array..
        System.out.println(arr[0].length);
    
    }
}
