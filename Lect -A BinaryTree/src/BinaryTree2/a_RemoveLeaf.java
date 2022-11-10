/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree2;

import java.util.Scanner;

/**
 *
 * @author Aditya
 */
public class a_RemoveLeaf {
    public static BinaryTreeNode<Integer> takeTreeinputBetter(boolean isRoot, int parentdata, boolean isLeft){
        if(isRoot){
        System.out.println("Enter root data");
        }
        else{
            if(isLeft){
                System.out.println("Enter left child of.."+parentdata);
            }
            else{
                
                System.out.println("Enter right child of.."+parentdata);
            }
        }
            Scanner s=new Scanner(System.in);
        
        int rootdata=s.nextInt();
        if(rootdata==-1){
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootdata);
        BinaryTreeNode<Integer> leftChild=takeTreeinputBetter(false, rootdata, true);
        BinaryTreeNode<Integer> rightChild=takeTreeinputBetter(false, rootdata, false);
        root.left=leftChild;
        root.right=rightChild;
        return root;
    }

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
     public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root){
         if(root==null){
             return null;
         }
         if(root.left==null && root.right==null){
             return null;
         }
         root.left=removeLeaves(root.left);
         root.right=removeLeaves(root.right);
         return root;
     }
     
     

public static void main(String[] args) {
    BinaryTreeNode<Integer> root=takeTreeinputBetter(true, 0, false);
        printTreeDetailed(root);
        BinaryTreeNode<Integer> newRoot=removeLeaves(root);
        printTreeDetailed(newRoot);
}
}
