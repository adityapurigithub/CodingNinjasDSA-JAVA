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

/*
Constructor is a function that have same name as that of class..
It is called only once and its called only when object is created..
Default constructor is there given by java system for all classes...

*/


public class e_constructor {
    int rollno;
    String name;
    String college;

    public e_constructor(int r,String n, String c) { 
        rollno=r;
        name=n;
        college=c;
        
    }
    public void print(){
        System.out.println("Rollno.."+rollno+" Name.."+name+" College.."+college);
    }
    
    
}
class main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        e_constructor obj=new e_constructor(10,"Aditya","TRAMIET");
        obj.print();
    }
}
