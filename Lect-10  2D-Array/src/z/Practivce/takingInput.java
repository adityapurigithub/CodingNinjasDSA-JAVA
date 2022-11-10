/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z.Practivce;

import java.util.Scanner;

/**
 *
 * @author Aditya
 */
public class takingInput {
    public static int[][] takeInput(){
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter No. of Rows");
        int rows=s.nextInt();
        
        System.out.println("Enter No. of Columns");
        int cols=s.nextInt();
        
        int [][]arr2d=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter elem at"+i+" th row and "+j+"th col");
                arr2d[i][j]=s.nextInt();
            }
            System.out.println();
        }
        return arr2d;
    }
    public static void printArr(int[][] arr2d){
        int rows=arr2d.length;
        int cols=arr2d[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr2d[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
//        int [][] arr2d={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//        int [][] arr2d=new int[3][4]// 3 rows 4 cols..
          int [][] arr2d=takeInput();
          printArr(arr2d);
        
        
    }
}
