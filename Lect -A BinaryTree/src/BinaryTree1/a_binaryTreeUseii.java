/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree1;

/**
 *
 * @author Aditya
 */
public class a_binaryTreeUseii {

    public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
        // base case...
        if (root == null) {
            return;
        }
        System.out.print(root.data+":");
        if(root.left!=null){
            System.out.print("L"+root.left.data+", ");
        }
        if(root.right!=null){
            System.out.print("R"+root.right.data);
        }        
        System.out.println();
        printTreeDetailed(root.left);
        printTreeDetailed(root.right);

    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);

        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);

        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
        root.left = rootLeft;
        root.right = rootRight;
        

        BinaryTreeNode<Integer> rootLr = new BinaryTreeNode<>(4);

        BinaryTreeNode<Integer> rootRl = new BinaryTreeNode<>(5);
        rootLeft.right = rootLr;
        rootRight.left = rootRl;

        printTreeDetailed(root);

    }

}
