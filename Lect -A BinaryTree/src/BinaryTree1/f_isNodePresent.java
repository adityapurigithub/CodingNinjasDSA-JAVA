/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree1;

import java.util.Scanner;

/**
 *
 * @author Aditya
 */
public class f_isNodePresent {

    
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

    
    public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {//O(n)
	    if(root==null){
            return false;
        }
        if(root.data==x){
            return true;
        }
        boolean inleft=isNodePresent(root.left,x);
        if(inleft){
            return true;
        }
        else{
            boolean inright=isNodePresent(root.right,x);
            return inright;
        }
    }
    
    
    
    public static void main(String[] args){
//        BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>();
          BinaryTreeNode<Integer> root=takeTreeinputBetter(true,0,false);
          printTreeDetailed(root);
            System.out.println("Checking 2 present or not..."+isNodePresent(root, 2));

        
    }
    
}

    

  
    