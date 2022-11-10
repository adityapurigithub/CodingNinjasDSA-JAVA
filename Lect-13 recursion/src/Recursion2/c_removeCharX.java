/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion2;

/**
 *
 * @author Aditya
 */
public class c_removeCharX {
    	public static String removeX(String input){
		// Write your code here
        if(input.length()==0){
            return input;
        }
        if((input.charAt(0)=='x')){
            return removeX(input.substring(1,input.length()));
        }
        return input.charAt(0) + removeX(input.substring(1, input.length()));

	}
        public static void main(String[] args){
            System.out.println("axsdxaxsd");
            System.out.print("Removing x....");
                        System.out.println(removeX("axsdxaxsd"));

        }
}
