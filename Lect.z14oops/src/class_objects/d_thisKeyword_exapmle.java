/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_objects;

/**
 *
 * @author Aditya
 */
public class d_thisKeyword_exapmle {
 
        int a; 
        int b; 

    public void set(int a, int b) 
    {  
        b = a; 
        this.b = b; 
    } 

    void display() 
    { 
        System.out.println("a=" + a + " b=" + b); 
    } 
}
class T{
    public static void main(String[] args) 
    { 
        d_thisKeyword_exapmle object = new d_thisKeyword_exapmle();
        object.set(10,20);
        object.display(); 
    } 
} 

