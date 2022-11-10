/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hashmap;
import java.util.*;
/**
 *
 * @author Aditya
 */
public class a_hashmap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating hashmap....
        HashMap<String,Integer> map=new HashMap<>();
        
        // inserting in hashmap...   //O(1)
        map.put("abc", 1);   //key,value   // keys are always unique..
        map.put("def",1);
        map.put("hij",3);
         
        //size...
        int size=map.size();   // size means no of keys present
        System.out.println(size);
        
        // checking presence..  //O(1)
        if(map.containsKey("abc")){
            System.out.println("yes it conatin");
        }
        
        if(map.containsKey("abc1")){   //O(1)
            System.out.println("yes it conatin");
        }
        
        // getting a value..
        int v=map.get("abc");    //O(N)
        System.out.println(v);
        
        //now when we want to get a value but if its not present
        //then it will give null pointer exception
        // so always check presence first and then get the value...
        int v2=0;
        if(map.containsKey("abc1")){
            v2=map.get("abc1");
        }
        System.out.println(v2);
        
        // remove..
        map.remove("abc");
        if (map.containsKey("abc")){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
         
        // iterating a hashmap..
          // set is a data structure taken to store the key set of hash map..
         Set<String> set=map.keySet();   // keyset is used to iterate
         for(String s: set){
             System.out.println(s);
         }
        
        
        
        
    }
    
}
