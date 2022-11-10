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
public class RowWiseSum {
    public static void RowSum(int arr2d[][]){
        int r=arr2d.length;
        int c=arr2d[0].length;
        for(int i=0;i<r;i++){
            int sum=0;
            for(int j=0;j<c;j++){
                sum+=arr2d[i][j];
            }
            System.out.println(sum);
        }
    }
    public static void ColSum(int arr2d[][]){
        int r=arr2d.length;
        int c=arr2d[0].length;
        for(int i=0;i<r;i++){
            int sum=0;
            for(int j=0;j<c;j++){
                sum+=arr2d[j][i];
            }
            System.out.println(sum);
        }
    }
    public static void main(String[] args){
        int [][] arr2d={{1,2,5},{6,22,5},{9,7,2}};
        System.out.println("Row Sum...");
        RowSum(arr2d);
        System.out.println("Col Sum...");
        ColSum(arr2d);
        
    }
}
