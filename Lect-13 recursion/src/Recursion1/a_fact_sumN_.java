/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion1;

/**
 *
 * @author Aditya
 */
public class a_fact_sumN_ {

    /**
     * @param args the command line arguments
     */
    
    public static int fact(int n){
        if(n==0){             // if this condtional st. is not here then..
            return 1;        // it will keep calling fact function even after n=0...
        }
        int smallOutput=fact(n-1);
        int output=n*smallOutput;
        return output;
                     // this function define how recursion works..
    }
    public static int sumN(int n){
        if(n==0){
            return 0;
        }
        int smalloutput=sumN(n-1);
        int ans=n+smalloutput;
        return ans;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(fact(5));
        System.out.println(sumN(4));
    }
    
}
