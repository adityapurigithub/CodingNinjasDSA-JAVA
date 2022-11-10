/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;
import java.io.*;
import java.util.*;

/**
 *
 * @author Aditya
 */
public class a1_StackUsingArr {
    /*Stack works in LIFO fashion*/

    /**
     * @param args the command line arguments
     */
    private int data[];
    private int topIndex;
    
    public a1_StackUsingArr(){
        data =new int[2];
        topIndex=-1;
    }
//    public a1_StackUsingArr( int size){  // for specifying size to a stack we we create this constructor
//        data=new int[size];
//        topIndex=-1;
//    }
    
    
//    public int push(int elem ){  //O(1)
//        //if stack is full..
//        if(topIndex==data.length-1){  // here we can also create exception
//            System.out.println("Error FULLSTACK");
//        }
//        data[++topIndex]=elem;
//        return (data[topIndex]);
//    }
    
    // if we want to double the capacity when satck get full..we will use this ...push method
    public int push(int elem){
       if(topIndex==data.length-1){
           doublecapacity();
           
       }
       data[++topIndex]=elem;
        return (data[topIndex]);
    }
    private void doublecapacity() {
        System.out.println("Doubling capacity");
        int temp[]=data;
        data=new int[2*temp.length];
        for (int i=0;i<temp.length;i++){
            data[i]=temp[i];
            
        }
    }
    
    
    public int top(){   //O(1)
        //No element
        if(topIndex==-1){
            System.out.println("Error..NoELEMENT");
        }
        return data[topIndex];

    }
    public boolean isEmpty(){  //O(1)
        if(topIndex==-1){
            return true;
        }
        else{
            return false;
        }
        
    }
    public int size(){   //O(1)
        return topIndex+1;
    }
    
    public int pop(){  //O(1)
        //No element
        if(topIndex==-1){
            System.out.println("Error..NoELEMENT");
        }
        int temp=data[topIndex];
        topIndex--;
        return temp;
        
    }

    
    
}
