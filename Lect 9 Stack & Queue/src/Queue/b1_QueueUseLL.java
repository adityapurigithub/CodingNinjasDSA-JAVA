/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author Aditya
 */
public class b1_QueueUseLL {
    public static void main(String[] args) throws QueueEmptyException{
    b1_QueueUsingLL<Integer> queue=new b1_QueueUsingLL<>();
    int arr[]={1,2,3,1,3,4,8};
    for(int elem:arr){
        queue.enqueue(elem);
    }
    while(!queue.isEmpty()){
        System.out.println(queue.dequeue());
    }
    
    
}
}