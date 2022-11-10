
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
public class b1_linkedList_takeInput<t> {
    int data;
    b1_linkedList_takeInput<t> next;
    public b1_linkedList_takeInput(int data){
        this.data=data;
        next=null;
        
    }

}

    class mainLLinput{
        
        private static void printLL(b1_linkedList_takeInput<Integer> head) {
            b1_linkedList_takeInput<Integer> temp=head;
            while (temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
                
            }
        }
        private static b1_linkedList_takeInput<Integer> takeInput() {
               // time complexity is o(n);
            Scanner s=new Scanner(System.in);
            int data=s.nextInt();
            b1_linkedList_takeInput<Integer> head = null;
            b_linkedList_takeInput<Integer> tail = null;
            while(data!=-1){
                b1_linkedList_takeInput<Integer> currNode=new b1_linkedList_takeInput<Integer>(data);
            if(head==null){
                head=currNode;
                tail=currNode;
            }
            else{
                tail.next=currNode;
                tail=tail.next;
            }
            data=s.nextInt();
            }
            return head;
            
        }
        public static void main(String[] args){
//            b_linkedList_takeInput<Integer> head=createLinkedList();
                        b1_linkedList_takeInput<Integer> head=takeInput();

            printLL(head);
            

        }

    

    

    
}
