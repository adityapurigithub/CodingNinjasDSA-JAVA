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
public class largestSumColumnOrRow {
    public static int findLargestSum(int arr2d[][]){
        int r=arr2d.length;
        int c=arr2d[0].length;
        int maxSum=0;
        for(int i=0;i<r;i++){
            int sum=0;
            int sum1=0;
            for(int j=0;j<c;j++){
                sum+=arr2d[i][j];  //finding sum in rows
                
                sum1+=arr2d[j][i];  //finding sum in columns
                        
            }
            if(sum>maxSum){
                maxSum=sum;
            }
            if(sum1>maxSum){
                maxSum=sum1;
            }
        }
        return maxSum;
    }
    public static void main(String[] args){
        int [][] arr2d={{1,2,3},{44,5,22},{3,77,11}};
        int largestSum=findLargestSum(arr2d);
        System.out.println("Largest Sum  .."+largestSum);
    }
}
