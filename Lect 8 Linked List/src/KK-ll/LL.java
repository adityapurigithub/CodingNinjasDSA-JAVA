/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LL;

/**
 *
 * @author Aditya's PC
 */
public class LL {
    int data;
    LL  next;
    LL head;
    LL  tail;
    int size;
    
    public void size(LL head){
        this.size=0;
        System.out.println(size);
    }
    
    
    public LL(int data){
        this.data=data;
        size+=1;
    }
    
    public void insertFirst(LL head,int val){
        LL node=new LL (val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
        
    }
    public void display(LL head){
        if(tail==null){
            System.out.println("Empty list");
            return;
        }
        LL temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
   
    }
    
}
