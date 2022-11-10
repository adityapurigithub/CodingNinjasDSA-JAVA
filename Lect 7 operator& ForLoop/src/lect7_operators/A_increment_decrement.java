/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lect7_operators;

/**
 *
 * @author Aditya
 */
public class A_increment_decrement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Increment decrement operator..
        
        int a=60;
        int b=80;
        if(a++ >60 && b++ >80 ){
            System.out.print("inside if");
        }
        else{
            System.out.println("inside else");
        }
        System.out.println("a="+a+" b="+b);
        
        
        //
        int x=15;
        int  z = ++x;
        int y = x++;
        
        System.out.println(y +" " + z);
        
        
    }
    
}
