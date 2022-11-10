/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z.Practice;

import java.util.Scanner;

/**
 *
 * @author Aditya
 */
public class LLTakeInput1 {
    public static Node<Integer> takeInputLL(){
        Scanner s=new Scanner(System.in);
        int data=s.nextInt();
        
        Node<Integer> head=null;
        
        while(data!=-1){
            //creating a node and then....
            Node<Integer> curr=new Node<Integer>(data);
            if(head==null){
            //...pointing head to that node..
            head=curr;
            }else{
                Node<Integer> tail=head;
                while(tail.next==null){
                    tail=tail.next;
                }
                tail.next=curr;
            }            
            data=s.nextInt();
            
            
        }
        return head;
    }
     public static void main(String args[]){
         Node<Integer> head=takeInputLL(); 
         System.out.println(head);
     }
}
