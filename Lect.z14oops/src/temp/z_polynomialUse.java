/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temp;

import class_objects.z_polynomial;

/**
 *
 * @author Aditya
 */
public class z_polynomialUse {
    public static void main(String[] args){
        
    
    z_polynomial p1= new z_polynomial();
    p1.setCoff(0,3);
    p1.setCoff(2,2);
    p1.print();
    
    z_polynomial p2= new z_polynomial();
    p2.setCoff(0,3);
    p2.setCoff(2,2);
    p2.setCoff(1,4);
    p2.print();

    p1.add(p2);
    p1.print();
    p2.print();
    
    p2.multiply();
    p2.print();
    p1.print();
    
    z_polynomial p3= new z_polynomial.add(p1,p2);
    p3.print();
    p1.print();
    p2.print();
    
    int ans=p2.evaluate(10);
    System.out.println(ans);
    
    } 
}
