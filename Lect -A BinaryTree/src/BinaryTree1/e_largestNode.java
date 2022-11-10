/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree1;

import java.util.Scanner;
import java.util.*;


/**
 *
 * @author Aditya
 */
public class e_largestNode {
    
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
    public static int numNode(BinaryTreeNode<Integer> root){  // find total no of nodes
        if(root==null){
            return 0;
        }
        int leftcount=numNode(root.left);
        int rightcount=numNode(root.right);
        return 1+leftcount+rightcount;
    }
    public static int getSum(BinaryTreeNode<Integer> root) {  //total sum of nodes
		if(root==null){
            return 0;
        }
        int leftsum=getSum(root.left);
        int rightsum=getSum(root.right);
        return root.data+leftsum+rightsum;
	}
    public static int largestNode(BinaryTreeNode<Integer> root){//O(n)
        if(root==null){
            return -1;
        }
        int findinleft=largestNode(root.left);
        int findinright=largestNode(root.right);
        return Math.max(root.data, Math.max(findinleft, findinright));
    }
    
    
    
    
    public static void main(String[] args){
//        BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>();
          BinaryTreeNode<Integer> root=takeTreeinputBetter(true,0,false);
          printTreeDetailed(root);
//          System.out.println("No of nodes.."+numNode(root));
//          System.out.println("Sum of nodes are.."+getSum(root));
            System.out.println("largest node is..."+largestNode(root));

        
    }
    
}

    

  