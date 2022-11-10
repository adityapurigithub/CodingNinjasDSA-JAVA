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
public class d_thisKeyword {
     private int rollno;
    String name;
    
// this is a reference to the object on which the function is being called..
    
    public void setrollno(int rollno){
        this.rollno=rollno;   //this  keyword gives the reference of the object..
                                 // using which the function is being called.
        System.out.println("this.."+this);
}
    public int getrollno(){
        return rollno;
    }
    
}
class d_thisKeyword_main {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        d_thisKeyword ob=new d_thisKeyword();
        ob.setrollno(10);
                System.out.println("ob.."+ob);

        
        int rollno=ob.getrollno();
        
        String name=ob.name;
        System.out.println("Name.."+name+" Rollno..."+rollno);
        
    }
}


