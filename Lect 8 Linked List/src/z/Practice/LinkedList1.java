/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z.Practice;

/**
 *
 * @author Aditya
 */
public class LinkedList1 {
    
    public static Node<Integer> createLL(){
        Node<Integer> n1=new Node<>(10);
        //n1 is the refernce nit the node...
        //new will create a node in memory with data 10...so on..
        
        Node<Integer> n2=new Node<>(20);
        Node<Integer> n3=new Node<>(30);
        Node<Integer> n4=new Node<>(40);
        
        //n2 has the reference so n1.next will store its ref.
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        
        return n1;

    }
//    public static void PrintLL(Node<Integer> head){
//        System.out.println(head);
//        
//        System.out.println("1st node data.."+head.data);
//        System.out.println("2nd node data.."+head.next.data);
//        System.out.println("3rd node data.."+head.next.next.data);
//        System.out.println("4th node data.."+head.next.next.next.data);
//        
//    }
    public static void PrintLL1(Node<Integer> head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    public static int lengthOfLL(Node<Integer> head){
        int i=0;
        //using temp because in case we need the first element that head is pointing..
        //it will get lost if head is assigned to next...so using temp...
        Node<Integer> temp=head;
        while(temp!=null){
            i++;
            temp=temp.next;
        }
        return i;
    }
    public static void main(String args[]){
           Node<Integer> n=new Node<>(10);
            System.out.println(n);
            System.out.println(n.data);
            System.out.println(n.next);
            
            Node<Integer> head=createLL();
            System.out.println("head"+head);
            
//            PrintLL(head);
              PrintLL1(head);
              int lenght=lengthOfLL(head);
              System.out.print(lenght);

    }
}
