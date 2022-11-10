/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aditya
 */
public class a_NodeClass_BuildList<t> {//instead<integer> we can use generic as..<T>or<A>or any alphabet..
    int data;
     a_NodeClass_BuildList<t> next;

    public a_NodeClass_BuildList(int data) {
    this.data=data;
    next=null;
    }
     
    
    
}
class mainNodeClass{
public static void main(String[] args){
a_NodeClass_BuildList<Integer> n1=new a_NodeClass_BuildList(10);
a_NodeClass_BuildList<Integer> n2=new a_NodeClass_BuildList(20);
    System.out.println(n1);// it store the refernce
    System.out.println(n1.data);
    System.out.println(n1.next);
    
}
}