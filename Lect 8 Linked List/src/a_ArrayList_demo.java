/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aditya
 */

import java.util.*;
public class a_ArrayList_demo {
    public static void main(String[] args){
        
 // internally arrlist keep an array and will shrink or grow on demand of user...
 // thus we use arraylist as it has advantages..like its dynamic acc to use...
// and we can use this when arr size is not sure or depends on the condition we working on
//
   // arrayList declaration....
        ArrayList<Integer> arr=new ArrayList<>(20); // ArrayList of type int with capacity 20..20 is not size here..   
                       // capacity that we provided and its can grow more... size mean present no o element 
                                            
        //adding element to arrlist..
        arr.add(10);  //at index 0
        arr.add(20);  //at index 1
        arr.add(30);  //at index 2
          
        System.out.println("arrlist size means no of element present  "+arr.size());// arrlist present size/length determined like this 
                                                   // present size means current size of array not the total capacity
        System.out.println("element at index 2 before adding an element  "+arr.get(2));  // accesing element at index
        
        //adding element at a index..
        arr.add(1,22);  // adding 22 to 1st index..
        System.out.println("After adding index 0 has  "+arr.get(0));
        System.out.println("After adding index 1 has  "+arr.get(1));
        System.out.println("After adding index 2 has  " +arr.get(2));
        System.out.println("After adding size increse to 4  "+arr.get(3));
        
        arr.remove(1);// afteer removing other element will shift to left
        System.out.println("After removing element from index1,at 0   "+arr.get(0));
         System.out.println("After removing element from index1,at 1   "+arr.get(1));
         System.out.println("After removing element from index1,at 2   "+arr.get(2));
         
         arr.set(0, 100);// set will only replace with previous value and set new value at that index
         System.out.println("After setting index 0 has  "+arr.get(0));
        System.out.println("After setting index 1 has  "+arr.get(1));
        System.out.println("After setting index 2 has  " +arr.get(2));
         
        // for reading element by iterating is done as...
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        
    }
    // for each loop --Enhanced for loop...
    for(int i:arr){  // it means for every element i in arr ...we can travel over for loop    
        System.out.println(i);
    
    }
        
//        
//        
//        
//        System.out.println();
//        System.out.println();
//        ArrayList<String> list = new ArrayList<String>() ;
//list.add( "apple" );
//list.add( "banana" );
//list.add( "carrot" );
//
//        System.out.println(list.get(0));
//        
//        System.out.println(list.get(1));
//list.add( 0, "mango" );
//
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
        
        
    }
}
