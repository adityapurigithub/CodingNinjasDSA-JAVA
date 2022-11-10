/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrList;
import java.util.ArrayList;
/**
 *
 * @author Aditya
 */

//BASICS OF ARRLIST..........................................................
public class arrList {
    public static void main(String [] args){
    ArrayList<Integer> a=new ArrayList<Integer>();
    ArrayList<Integer> ar=new ArrayList<Integer>(20);
    /*20 is the capacity not size,..capacity is the max no of element it can have....
      by default the capacity is 10...  */
        //add elements
        a.add(1);
        a.add(2);
        a.add(3);

        System.out.println(a);
        System.out.println(a.size());
        System.out.println(a.get(0));
        
        a.add(2,22) ; //add 22 at 3rd index...
        System.out.println(a);
        
        a.remove(2); //remove from 2 index
        System.out.println(a);

        a.set(0, 100);//replace value to 50 at 0th index 
        System.out.println(a);

        //iteration...
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
        
//        Enhanced for loop / for-each loop...when we need to travel over the whole arr..
        for(int i:a){  //for every elem 'i' in 'a' ...i=value of each elem/a=arr
            System.out.println(i);
        }
    
    
}
}
