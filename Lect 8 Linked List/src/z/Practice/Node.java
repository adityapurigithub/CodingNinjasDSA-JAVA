/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z.Practice;

/**
 *
 * @author Aditya
 */
public class Node<T> {
    T data;
    Node<T> next;
    
    Node(T data){
        this.data=data;
}
}