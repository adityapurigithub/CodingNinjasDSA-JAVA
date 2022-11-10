/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionAssignment;

import java.util.Scanner;

/**
 *
 * @author Aditya
 */
public class a_GeometricSum {
    public static double geometricSum(int k){
        if(k==0){
            return 1;
        }
        double smallans=geometricSum(k-1);
        double ans=(double) (smallans+1/(2^k));
        return ans;
    }
    
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        System.out.print(geometricSum(k));
    }
}
