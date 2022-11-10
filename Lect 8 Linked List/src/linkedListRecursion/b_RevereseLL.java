/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedListRecursion;

/**
 *
 * @author Aditya
 */
public class b_RevereseLL<t>{
    t data;
    b_RevereseLL<t> next;

    public b_RevereseLL(t data) {
        this.data=data;
        next=null;
    }
    

    public b_RevereseLL<Integer> reverse(b_RevereseLL<Integer> head){
        if(head==null || head.next==null){
         	return head;   
        }
        b_RevereseLL<Integer> tail=head.next;
        reverse(head.next);
        tail.next=head;
        return head;
    
}
    
}
 class solution{
    public static void main(String[] args){
        b_RevereseLL<Integer> head=new b_RevereseLL<>(10);
    }
}
