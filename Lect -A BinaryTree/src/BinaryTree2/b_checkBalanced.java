/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree2;

import java.util.*;

/**
 *
 * @author Aditya
 */
public class b_checkBalanced {

    public static BinaryTreeNode<Integer> takeTreeinputBetter(boolean isRoot, int parentdata, boolean isLeft) {
        if (isRoot) {
            System.out.println("Enter root data");
        } else {
            if (isLeft) {
                System.out.println("Enter left child of.." + parentdata);
            } else {

                System.out.println("Enter right child of.." + parentdata);
            }
        }
        Scanner s = new Scanner(System.in);

        int rootdata = s.nextInt();
        if (rootdata == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootdata);
        BinaryTreeNode<Integer> leftChild = takeTreeinputBetter(false, rootdata, true);
        BinaryTreeNode<Integer> rightChild = takeTreeinputBetter(false, rootdata, false);
        root.left = leftChild;
        root.right = rightChild;
        return root;
    }

    public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
        // base case...
        if (root == null) {
            return;
        }
        System.out.print(root.data + ":");
        if (root.left != null) {
            System.out.print("L" + root.left.data + ", ");
        }
        if (root.right != null) {
            System.out.print("R" + root.right.data);
        }
        System.out.println();
        printTreeDetailed(root.left);
        printTreeDetailed(root.right);

    }
//     public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root){
//         if(root==null){
//             return null;
//         }
//         if(root.left==null && root.right==null){
//             return null;
//         }
//         root.left=removeLeaves(root.left);
//         root.right=removeLeaves(root.right);
//         return root;
//     }

    public static int height(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int leftheigth = height(root.left);
        int rightheigth = height(root.right);
        return 1 + Math.max(leftheigth, rightheigth);
    }

    public static boolean CheckBalancedTree(BinaryTreeNode<Integer> root) {
        if(root==null){
            return true;
        }
        int leftH=height(root.left);
        int rightH=height(root.right);
        
        if(Math.abs(leftH-rightH) > 1){
            return false;
        }

        
    }
    public static c_balancedTreereturn CheckBalancedTreeBetter(BinaryTreeNode<Integer> root) {
       if(root==null){
        int height=0;
        boolean isBal=true;
        c_balancedTreereturn ans=new c_balancedTreereturn();
        ans.height=height;
        ans.isBalanced=isBal;
        return ans;
        }
       c_balancedTreereturn leftop=CheckBalancedTreeBetter(root.left);
       c_balancedTreereturn rightop=CheckBalancedTreeBetter(root.right);
       boolean isBal=true;
       int height=1+Math.max(leftop.height, rightop.height);
       if(Math.abs(leftop.height-rightop.height)>1){
           isBal=false;
           
       }
       if(!leftop.isBalanced || !rightop.isBalanced){
           isBal=false;
           
       }
       c_balancedTreereturn ans=new c_balancedTreereturn();
       ans.height=height;
       ans.isBalanced=isBal;
       return ans;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeTreeinputBetter(true, 0, false);
        printTreeDetailed(root);
//        BinaryTreeNode<Integer> newRoot=removeLeaves(root);
//        printTreeDetailed(newRoot);
        System.out.println(CheckBalancedTree(root));
        
        System.out.println(CheckBalancedTreeBetter(root).isBalanced);
        
    }
}
