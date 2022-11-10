/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedListRecursion;

import java.util.Scanner;

/**
 *
 * @author Aditya
 */
public class a_print_insert_inLL_recursion<t> {

    t data;
    a_print_insert_inLL_recursion<t> next = null;

    public a_print_insert_inLL_recursion(t data) {
        this.data = data;
    }

}

class mainprintLL {// almost working not proper correct...

    public static a_print_insert_inLL_recursion<Integer> takeInput() {

        // time complexity is o(n);
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        a_print_insert_inLL_recursion<Integer> head = null;
        a_print_insert_inLL_recursion<Integer> tail = null;
        while (data != -1) {
            a_print_insert_inLL_recursion<Integer> currNode = new a_print_insert_inLL_recursion<Integer>(data);
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

    private static void printll(a_print_insert_inLL_recursion<Integer> head) {
        a_print_insert_inLL_recursion<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

    private static void printllrec(a_print_insert_inLL_recursion<Integer> head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        printll(head.next);// to print in reverese order put this line before print statement
    }

    private static a_print_insert_inLL_recursion<Integer> insertRec(a_print_insert_inLL_recursion<Integer> head, int elem, int pos) {
        if (head == null && pos > 0) {
            return head;
        }
        if (pos == 0) {
            a_print_insert_inLL_recursion<Integer> newNode = new a_print_insert_inLL_recursion<>(elem);
            newNode.next = head;
            return newNode;
        } else {
            a_print_insert_inLL_recursion<Integer> smallerHead = insertRec(head.next, elem, pos - 1);
            head.next = smallerHead;
            // instead of above both line it can be written as..head.next=insertRec(head.next, elem,pos-1) 
            return head;
        }

    }

    private static a_print_insert_inLL_recursion<Integer> delRec(a_print_insert_inLL_recursion<Integer> head, int pos) {
        if (head == null && pos > 0) {
            return head;
        }
        if (pos == 0) {
            a_print_insert_inLL_recursion<Integer> newhead = head.next;
            return newhead;
        } else {
            a_print_insert_inLL_recursion<Integer> smallerOp = delRec(head.next, pos - 1);
            head.next = smallerOp;
            return head;
        }
    }

    private static a_print_insert_inLL_recursion<Integer> revreseLLrec(a_print_insert_inLL_recursion<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        a_print_insert_inLL_recursion<Integer> smallOp = revreseLLrec(head.next);
        a_print_insert_inLL_recursion<Integer> tail = smallOp;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head;
        head.next = null;
        return smallOp;
    }
//     public static a_print_insert_inLL_recursion<Integer> reverse(a_print_insert_inLL_recursion<Integer> head){
//        if(head==null || head.next==null){
//         	return head;   
//        }
//        a_print_insert_inLL_recursion<Integer> tail=head.next;
//        reverse(head.next);
//        tail.next=head;
//        return head;
//     }
     

public static void main(String[] args) {
        a_print_insert_inLL_recursion<Integer> head = takeInput();
//        printll(head);

        printllrec(head);
//        insertRec(head, 2, 0);
//        System.out.println();
//        printllrec(head);
//        System.out.println();
//        delRec(head,0);
//        printllrec(head);
//        
        System.out.println();
        revreseLLrec(head);
        printllrec(head);
    }

    

    

}
