/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lect.pkg10.string;

import java.util.Arrays;

/**
 *
 * @author Aditya
 */
public class a_basicString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char arr[]={'c','o','d','i','n','g'};
            // we need to store coding 
              // it is easier to store in string rather than array..
        String str="coding";   // string is a non primitve data type
        String str2="coding";
        String str3="Coding ninjas is awesome";
        System.out.println(str.equals(str2));
        System.out.println(Arrays.toString(str3.split(" ")));
        System.out.println(arr[0]);
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.charAt(2));
            // str[i] is not allowed in java...
            
            //concatinate str's
            System.out.println(str+str2);
                // func for concatinate....s1.concat(s2)
                System.out.println(str.concat(str2));

          // equals and compareTo...
          String s1="Aditya";
                    String s11="Aditya";

          String s2="aditya";
          String s3="aaitya";
          System.out.println(s1.equals(s2)); // equals to is case sensitive
          System.out.println(s1.equals(s11));
          System.out.println(s1.equals(s3));        
          System.out.println(s1.compareTo(s2));  // o/p..-32 beacuse s1-s2(ascii value) 
          System.out.println(s1.compareTo(s3)); // it will compare from starting and 
                                            // if both are not equal than will subtract 1-2(Ascii value)..
          System.out.println(s1.compareTo(s11));// output is 0 if both are equal..                                  

            String a ="abcd";
String b="abcda";
System.out.println(a.compareTo(b));// if length are not equal then it will return -1...
          
          // contains tells whether it iis present in string..
          
          String a1="Aditya Puri";
          System.out.println(a1.contains("Puri"));
  
    }
    
}
