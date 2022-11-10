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
public class b_findPower {
    public static int power(int x, int n) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
        if(n==0){
            return 1;
        }
        int smallOutput=power(x,n-1);
        int ans=x*smallOutput;
        return ans;
	}

public static void main(String [] args){
    System.out.println(power(4, 3));
}
}