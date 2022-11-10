/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_objects;

/**
 *
 * @author Aditya
 */
import java.util.*;
public class j_DynamicArr {
    private int data[];// defining arr
    private int nextElementIndex;
    
    public j_DynamicArr(){
        data=new int[5];// declaring arr
        nextElementIndex=0;
    }
    

    

    public int size() {
        return nextElementIndex;
    }

    public boolean isEmpty() {
        return nextElementIndex==0;
    }
    
    public int get(int i) {
        if(i>=nextElementIndex){
            //will throw err..
            return -1;
        }
       return data[i]; 
    }
    void add(int elem) {
 //this func will add new element in arr..
    if(nextElementIndex==data.length){
        doubleCapacity();
    }
    
    data[nextElementIndex]=elem;
    nextElementIndex++;
    }
    public int removeLast() {
        if(nextElementIndex==0){
            return -1;
        }
        int temp=data[nextElementIndex-1];
        data[nextElementIndex-1]=0;
        nextElementIndex--;
        return temp;
    }

    void set(int i, int elem) {
        if(i>=nextElementIndex){
            //err
            return;
        }
        data[i]=elem;
    }
        
    

    private void doubleCapacity() {
        int temp[]=data;
        data=new int[2*temp.length];
        for(int i=0;i<temp.length;i++){
            data[i]=temp[i];
            
        }
    }
}

    

class mainDynamicArr{
    public static void  main(String[] args){
        j_DynamicArr d=new j_DynamicArr();
        for(int i=1;i<100;i++){  
            //inserting 100 elements
            d.add(100+i);
        }
        System.out.println(d.size());
        System.out.println(d.get(2));// to get value at 2nd index
        System.out.println(d.get(3));
        d.set(3,170); //set 3rd index value to 170
        System.out.println(d.get(3));
//        
        while(!d.isEmpty()){
            System.err.println(d.removeLast());
            System.out.println("Size= "+d.size());
        }
//        
    }
}
//
