/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LL;

/**
 *
 * @author Aditya's PC
 */
public class main {
    public static void main(String[] args) {
        LL head=new LL(10);
        head.display(head);

        head.insertFirst(head,1);
        head.insertFirst(head,2);
        head.display(head);
        head.size(head);

    }
}
