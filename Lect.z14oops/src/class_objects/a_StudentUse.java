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
public class a_StudentUse {
    public static void main(String[] args){
        a_Student s1=new a_Student(); // s1,s2 are just the refrence to objects.......stored in dtack memory
         a_Student s2=new a_Student();//actual object is created using when we call the constructor using new keyword(--allocate memory dynamically)-----object created in heap
         
         System.out.println(s1);// give the reference of properties stored...
              // it means s1 is storing the reference of object or data/properties its storing
              // s1 is stored in stack and the properties/data is stored in heap...
         
              
      // accessing properites of class
        System.out.println(s1.name);
        System.out.println(s1.rollNo);  //gives output null or 0..
        
        s1.rollNo=111;
        System.out.println(s1.rollNo);
         
         
    }
}
