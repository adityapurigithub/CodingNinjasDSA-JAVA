/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zPractice;

import java.util.HashMap;

/**
 *
 * @author Aditya's PC
 */
public class countNonDuplicateChar {
    public static void main(String[] args) {
        String s= "ADITYA";
        HashMap<Character,Integer> map=new HashMap<>();
                    int count=0;

        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int value= map.get(s.charAt(i));
                map.put(s.charAt(i), value+1);
            }else{
                map.put(s.charAt(i), 1);
            }     
        }
        for(int i=0;i<map.size();i++){
            if(map.containsValue(1)){
                //stucked..
            }
        }
       
        System.out.println(count);
    }
}
