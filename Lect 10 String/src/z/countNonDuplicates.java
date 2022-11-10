/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z;

/**
 *
 * @author Aditya's PC
 */
public class countNonDuplicates {
    
    public static void main(String[] args) {
        String s="adiatya";
        
      int count=countND(s);
        System.out.println(count);
    }

    public static int countND(String s) {
        int count=0;
        for(int i=0;i<s.length()-1;i++){
                    for(int j=i+1;j<s.length();j++){
                        if(s.charAt(i)!=s.charAt(j)){
                            continue;
                        }else{
                            count++;
                        }
        }
    }
                return count;

            
}
