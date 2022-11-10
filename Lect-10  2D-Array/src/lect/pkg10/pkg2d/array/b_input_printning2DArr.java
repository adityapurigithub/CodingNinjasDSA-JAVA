/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lect.pkg10.pkg2d.array;

import java.util.Scanner;

/**
 *
 * @author Aditya
 */
public class b_input_printning2DArr {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter rows..");
        int rows=s.nextInt();
        
        System.out.println("Enter Columns..");
        int cols=s.nextInt();
        
        int [][]arr=new int[rows][cols];
        
        for (int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter the element at "+i+" row "+j+" column");
                arr[i][j]=s.nextInt();
                
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
                
            }
            System.out.println();
        }
                
                
                
    }
    
}
