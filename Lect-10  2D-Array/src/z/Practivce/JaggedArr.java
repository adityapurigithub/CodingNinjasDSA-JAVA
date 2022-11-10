/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z.Practivce;

/**
 *
 * @author Aditya
 */
public class JaggedArr {
    //jagged arr are those in which the col length are not same....
    
    public static void main(String[] args){
        int arr[][]=new int[4][];
        for(int i=0;i<arr.length;i++){
            arr[i]=new int[i+1]; //no of cols are not same and are diffrent in each row
        }
//        System.out.println(arr[0][1]);
        
        //for printing a right angle triangle pattern..
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    
}
