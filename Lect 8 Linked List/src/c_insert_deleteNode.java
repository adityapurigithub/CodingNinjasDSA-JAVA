
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aditya
 * @param <t>
 */
public class c_insert_deleteNode<t> {

    t data;
    c_insert_deleteNode<t> next = null;

    public c_insert_deleteNode(t data) {
        this.data= data;
    }
}

class mainInsertNode {

    public static c_insert_deleteNode<Integer> takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("last integer should be -1");
        int data = s.nextInt();
        c_insert_deleteNode<Integer> head = null;
        c_insert_deleteNode<Integer> tail = null;
        while (data != -1) {
            c_insert_deleteNode<Integer> currNode = new c_insert_deleteNode<Integer>(data);
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

    private static void print(c_insert_deleteNode<Integer> head) {
        c_insert_deleteNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;

        }
    }

    public static c_insert_deleteNode<Integer> Insertnode(c_insert_deleteNode<Integer> head, int pos, int data) {
        c_insert_deleteNode<Integer> nodeTobeInsreted = new c_insert_deleteNode<Integer>(data);
        if (pos==0){
            nodeTobeInsreted.next=head;
//            head=nodeTobeInsreted;
            return head;
        }
        else{
        int count = 0;
        c_insert_deleteNode<Integer> prev = head;
        
        while (count < pos - 1 && prev!=null) {
            count++;
            prev = prev.next;

        }
        if(prev!=null){
        nodeTobeInsreted.next = prev.next;

        prev.next = nodeTobeInsreted;

    }
                

    }
        return head;
    }
    
    private static c_insert_deleteNode<Integer> delNode(c_insert_deleteNode<Integer> head, int pos) {
        if (pos==0){
            return head;
        }
        else{
            int count = 0;
        c_insert_deleteNode<Integer> temp = head;
        while (count<pos-1 && temp!=null) {
            temp=temp.next;
            count++;
        }
        if(temp==null || temp.next==null){
            return head;
    }
        temp.next=temp.next.next;
    }
                return head;

    }

    public static void main(String[] args) {
        c_insert_deleteNode<Integer> head = takeInput();
        print(head);
        Scanner s = new Scanner(System.in);
        int pos = s.nextInt();
//        int data = s.nextInt();
//        head=Insertnode(head, pos, data);
//        print(head);
        head=delNode(head,pos);
//        takeInput();
        print(head);

    }

    
}
