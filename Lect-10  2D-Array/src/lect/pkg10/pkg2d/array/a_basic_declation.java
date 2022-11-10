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
public class a_basic_declation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr2d [][] =new int[3][4];//int this way 2d array is declared..her 3 representrows and 4 represent column
      System.out.println(arr2d[1][2]);
      arr2d[2][3]=12;
        System.out.println(arr2d[2][3]);
   }  
}
