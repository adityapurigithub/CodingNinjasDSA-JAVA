
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
public class b2_LinkedList {
    //Linked lists are linear data structures that hold data in individual objects called nodes. ... 
    //Linked lists are often used because of their efficient insertion and deletion. 
    //They can be used to implement stacks, queues, and other abstract data types.

    public static a_NodeClass_BuildList<Integer> createLinkedList() {

        a_NodeClass_BuildList<Integer> n1 = new a_NodeClass_BuildList(10);  // integer type node..n1 is the object
        a_NodeClass_BuildList<Integer> n2 = new a_NodeClass_BuildList(20);
        a_NodeClass_BuildList<Integer> n3 = new a_NodeClass_BuildList(30);
        a_NodeClass_BuildList<Integer> n4 = new a_NodeClass_BuildList(40); // n1,n2,n3,n4 hold refrence /address of nodes
        n1.next = n2;// it means that n1 is holding refrence or address at which n2 is stored..
        n2.next = n3;
        n3.next = n4;

        return n1;
    }

    private static void printLinkedList(a_NodeClass_BuildList<Integer> head) {
        System.out.println("Print head.. " + head);
        // not a good way but its a method...
//        System.out.println(head.data);
//        System.out.println(head.next.data);
//        System.out.println(head.next.next.data);

        // iterative method..
        a_NodeClass_BuildList<Integer> temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;  // increment statement for linked list..
        }

    }

    public static void increment(a_NodeClass_BuildList<Integer> head) {
        a_NodeClass_BuildList<Integer> temp = head;
        while (temp != null) {
            temp.data++;
            temp = temp.next;  // increment statement for linked list..
        }

    }

    private static int lengthofList(a_NodeClass_BuildList<Integer> head) {
        int count = 0;
        a_NodeClass_BuildList<Integer> temp = head;
        while (temp != null) {

            count = count + 1;
            temp = temp.next;

        }
//        System.out.print(count);
        return count;
    }
    private static void printIthNode(a_NodeClass_BuildList<Integer> head, int i) {
        int count = 0;
        a_NodeClass_BuildList<Integer> temp = head;
        while (count<i || temp!=null) {
            if(count==i){
                System.out.println(temp.data);
            }

            count = count + 1;
            temp = temp.next;

        }
        
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        a_NodeClass_BuildList<Integer> head = createLinkedList();
        System.out.println("Mains head " + head);
//        increment(head);
        printLinkedList(head);
        System.out.println(lengthofList(head));
        
        //to print i th node will take a variable i..
        int i=s.nextInt();
        printIthNode(head,i);
    }

    
}
