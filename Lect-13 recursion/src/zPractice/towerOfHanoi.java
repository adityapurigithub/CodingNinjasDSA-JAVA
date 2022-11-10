/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zPractice;

/**
 *
 * @author Aditya
 */
public class towerOfHanoi {
    /*in tower of hanoi we have to move the disk from source to destination using a helper...
    here we have to move a disk at a time ....
    using recursion we will move n-1 to helper using destination and then the nth 
    disk to destination using helper.....
    */
    public static void towerofHanoi(int n ,char s,char h,char d){
        if(n==1){
            System.out.println("move first disk from "+s+" to "+d);
            return;
        }
        towerofHanoi(n-1, s, d, h);
        
        System.out.println("move the "+n+" th/nd disk from "+s+" to "+d);
        towerofHanoi(n-1, h, s, d);
        
    }
    public static void main(String[] args){
        towerofHanoi(4, 's','h', 'd');
        
    }
}
