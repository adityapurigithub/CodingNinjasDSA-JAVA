/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hashmap;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Aditya
 */
public class c_printIntersection {
    public static void printIntersection(int a1[],int a2[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a1.length;i++){
            if(map.containsKey(a1[i])){
                int val=map.get(a1[i]);
                map.put(a1[i],val+1);
            }else{
                map.put(a1[i],1);
            }
        }
        for(int i=0;i<a2.length;i++){
            //if map already contains the key then only its intersection..
            if(map.containsKey(a2[i])){
                int val=map.get(a2[i]);
                if(val>0){
                System.out.println(a2[i]);
                map.put(a2[i], val-1);
                }
            }
        }
    }
      
    
    public static void main(String args[]){
        int a1[]={1,3,2,2,3,6,2,5};
        int a2[]={2,4,2,3,5,6,6};
        printIntersection(a1,a2);
    }
}
