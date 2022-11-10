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
public class c_BreakKeyword_FOR_While {
    public static void main(String[] args){
        //Break key word Exits its immediate loop ...
        // Return keyword exit from main direcly...
        int n=5;
        int i=1;
        while(i<=n){
            if(i==3){
            break;   //Check return also..
            }
            System.out.println(i);
            i++;
        }
        System.out.println();
        
        for(int a=1;a<=n;a++){
            if(a==4){
                break;
            }
            System.out.println(a);
        }
        
    }
    
}
