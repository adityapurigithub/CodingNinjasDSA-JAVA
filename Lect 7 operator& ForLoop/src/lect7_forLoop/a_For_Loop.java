/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lect7_forLoop;

/**
 *
 * @author Aditya
 */
public class a_For_Loop {
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
        
//        int i=1;
//        for( ; i<=n; i++){   //for loop should only have 2 semicolons
//          System.out.println(i);
//            }
//        System.out.println(i);
        System.out.println();

   for(int i = 0; i < 5; i = i + 1){
       System.out.print(i + " ");
       i = i + 1;  //here it will increment i again
}
        
        
    }
    
}
