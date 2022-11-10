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
public class g_StaticKeyword {
   int rollno;//instance variable  
   String name;  
   static String college ="ITS";//static variable 
   //static variable can be used to refer to the common property of all objects ...
   
   //constructor  
   g_StaticKeyword(int r, String n){  
   rollno = r;  
   name = n;  
   }  
   //method to display the values  
   void display (){System.out.println(rollno+" "+name+" "+college);}  
}  
//Test class to show the values of objects  
class TestStaticVariable1{  
 public static void main(String args[]){  
 g_StaticKeyword s1 = new g_StaticKeyword(111,"Karan");  
 g_StaticKeyword s2 = new g_StaticKeyword(222,"Aryan");  
 //we can change the college of all objects by the single line of code  
 //class_name.college="BBDIT";  
 s1.display();  
 s2.display();  
 }  
}  