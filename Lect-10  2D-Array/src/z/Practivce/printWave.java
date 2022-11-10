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
public class printWave {
    public static void printLikeAWave(int arr[][]){
        int rows=arr.length;
        int cols=arr[0].length;
        for(int i=0;i<rows;i++){
            if(i%2==0){
            for(int j=0;j<cols;j++){
                System.out.println(arr[j][i]);
            }
            }else{
                for(int j=cols-1;j>=0;j--){
                System.out.println(arr[j][i]);
            }
                
            }
        }
    }
        
        
    
    public static void main(String[] args){
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        printLikeAWave(arr);
    }
}
