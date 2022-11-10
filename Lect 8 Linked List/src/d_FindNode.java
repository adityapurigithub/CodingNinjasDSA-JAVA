
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aditya
 */
public class d_FindNode<t> {
    t data;
    d_FindNode<t> next=null;
    public d_FindNode(t data){
        this.data=data;
    }
    }


class main{
    
    private static void print(d_FindNode<Integer> head) {
        d_FindNode<Integer> temp=head;
        if(temp==null){
            return ;
        }
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
    }
    }
    private static d_FindNode<Integer> takeInput() {
         Scanner s = new Scanner(System.in);
        System.out.println("last integer should be -1");
        int data = s.nextInt();
        d_FindNode<Integer> head = null;
        d_FindNode<Integer> tail = null;
        while (data != -1) {
            d_FindNode<Integer> currNode = new d_FindNode<Integer>(data);
            if (head == null) {
                head = currNode;
                tail = currNode;
            } else {
                tail.next = currNode;
                tail = tail.next;
            }
            data = s.nextInt();
        }
        return head;
    }
    public static void main(String[] args) {
       d_FindNode<Integer> head=takeInput();
       print(head);
       findNode(head,22);

    }

    private static int findNode(d_FindNode<Integer> head,int n) {
        int count=0;
        d_FindNode<Integer> temp=head;
        if(temp.data==n){
            return count;
        }
        else{
            while(temp!=null){
                
               temp=temp.next;
               count++;
            
            }
            
            
        }
        
    }

    

}

