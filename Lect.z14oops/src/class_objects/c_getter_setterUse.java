/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_objects;

import java.util.Scanner;

/**
 *
 * @author Aditya
 */
public class c_getter_setterUse {
    public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    c_getter_setter obj= new c_getter_setter();
    obj.setrollno(10);
    int getroll=obj.getrollno();
    
    String name=obj.name="Aditya";
    
        System.out.println(name);
        System.out.println(getroll);
    
    
    
}
}
