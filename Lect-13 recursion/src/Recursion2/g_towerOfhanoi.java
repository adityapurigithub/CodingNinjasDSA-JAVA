/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion2;

/**
 *
 * @author Aditya
 */
public class g_towerOfhanoi {
      // n = no of disk....s,h,d= names of rods..
    public static void towerhanoi(int n,char s,char h,char d){
        
        
        if(n==1){
            System.out.println("Move nth disk from source "+s+" to destination "+d);
            return;
        }
//        System.out.println("Moving n-1 disks from"+s+" to helper"+h);
        towerhanoi(n-1, s, d, h);
        
        System.out.println("Moving nth disk from source "+s+" to destination "+d);
        
//        System.out.println("Moving n-1 disks from "+h+ " to destination"+d);
        towerhanoi(n-1, h, s, d);
    }
    public static void main(String [] args){
        towerhanoi(4, 's', 'h', 'd');
    }
}
