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
public class b1_QueueUsingLL<T> {
   private Node<T> front;
    private Node<T> rear;
    int size;

    public b1_QueueUsingLL() {
        front =null;
        rear=null;
        size=0;
    
    }
    public int size(){  //o(1)
        return size;
    }
    public boolean isEmpty(){//o(1)
        return size==0;
    }
    public void enqueue(T elem){ //o(1)
        Node<T> newNode=new Node<>(elem);
        size++;
        if(rear==null){
            front=newNode;
            rear=newNode;
        }
        else{
            rear.next=(T) newNode;
            rear=newNode;
        }
        
    }
    public T front() throws QueueEmptyException {  //o(1)
        if(front==null){
            throw new QueueEmptyException();
            
        }
        return front.data;
    }
    public T dequeue() throws QueueEmptyException{
        if(front==null){
            throw new QueueEmptyException();
            
        }
        Node<T> delNode=front;
        front=(Node<T>) front.next;
        if(front==null){
            rear=null;
        }
        size--;
        return (T) delNode.data;
 }
    
    
}
