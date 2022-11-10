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
public class largestColumnSum {
    public static int largestColSum(int arr2d[][]){
        int r=arr2d.length;
        int c=arr2d[0].length;
        int maxSum=0;
                for(int i=0;i<r;i++){
                    int sum=0;
                    for(int j=0;j<c;j++){
                        sum+=arr2d[j][i];
            }
                    if(sum>maxSum){
                        maxSum=sum;
                    }
                
        }
                return maxSum;

    }
    public static void main(String[] args) {
        int a[][]={{1,2,3},{54,2,5},{5,66,7}};
        int largestColSum=largestColSum(a);
        System.out.println(largestColSum);
                        
    }
}

