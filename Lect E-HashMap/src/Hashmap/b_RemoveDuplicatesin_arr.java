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
public class b_RemoveDuplicatesin_arr {
    private static ArrayList<Integer> removeDuplicate(int[] arr) {
        HashMap<Integer,Boolean> map=new HashMap<>();
       ArrayList<Integer> output=new ArrayList<Integer>();
       for(int i=0;i<arr.length;i++){
           if(map.containsKey(arr[i])){
               continue;
           }else{
               map.put(arr[i], true);
               output.add(arr[i]);
           }
       }
       return output; 
        
        
    }
    public static void main(String[] args){
        int arr[]={1,2,2,3,1,1,3,6,8,7,4,4};
        ArrayList<Integer> output=removeDuplicate(arr);
        System.err.println(output);

    }

    

    
}
