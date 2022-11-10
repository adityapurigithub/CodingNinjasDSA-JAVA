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
public class totalSumOnBoundry_Daigonal {
    public static int totalSumOnDiagonalBoundry(int arr[][]){
//        int row=arr.length;
//        int col=arr[0].length;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j || (i+j)==arr.length-1){  //cond for diagonals
                    sum+=arr[i][j];
                }
               else if(i==0 || j==0 || i==arr.length-1 ||j==arr.length-1){ //for boundaries
                    sum+=arr[i][j];

                }
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int sum=totalSumOnDiagonalBoundry(arr);
        System.out.println("Total Sum On Diagonal & Boundry..."+sum);
    }
}
