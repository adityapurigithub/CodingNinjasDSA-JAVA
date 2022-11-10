/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree2;

/**
 *
 * @author Aditya
 */
public class BinaryTreeNode<t> {
    t data;
    BinaryTreeNode<t> left;
    BinaryTreeNode<t> right;

    public BinaryTreeNode(t data) {
        this.data=data;
        left=null;
        right=null;
    }
    
}
