/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lect9.array;

/**
 *
 * @author Aditya
 */
public class e_MultiplyArray {
    public static void mul(int [] arr)
{
    for(int i=0;i<5;i++)
    arr[i]*=i;

}
public static void main (String[] args) {
    int arr[]={1,2,3,4,5};
    mul(arr);
    for(int i=0;i<5;i++)
    {
        System.out.println(arr[i]);
    }
}
    
}
