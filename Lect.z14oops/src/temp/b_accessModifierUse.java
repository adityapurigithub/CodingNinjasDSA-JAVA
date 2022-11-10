/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temp;

/**
 *
 * @author Aditya
 */
public class b_accessModifierUse {
    public static void main(String args[]){
        b_accessModifier obj=new b_accessModifier();  // obj object is created..
        obj.a=10;   // a is deafault variable so it will be available to all classes
        obj.b=11;  // as.. b is a private variable so it will give error
        obj.c=1; // public variable c is also available to other classes..
        
        System.out.println(obj.a);
//        System.out.println(obj.b);
        System.out.println(obj.c);
        
        
        
    }
}
