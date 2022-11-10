/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;
import Stack.node;
/**
 *
 * @author Aditya
 */
public class b1_stackUsingLL<t> {
    private node<t> head;
    private int size;
    
    public b1_stackUsingLL(){
        head=null;
        size=0;
    }
    
    public void push(t elem){
        node<t> newNode=new node<>(elem);
        if(head==null){
         head=newNode;
        }else{
            newNode.next=(t) head; //here you have written null
            head=newNode;  
        }
        size++;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public t top(){
        if(head==null){
            System.out.println("THROW EXCEPTION");
        }
        return head.data;
    }
    public t pop(){
        if(head==null){
            System.out.println("THROW EXCEPTION");
        }
        t temp =head.data;
        head =(node<t>) head.next;
        size--;
        return temp;
    }
    
}
