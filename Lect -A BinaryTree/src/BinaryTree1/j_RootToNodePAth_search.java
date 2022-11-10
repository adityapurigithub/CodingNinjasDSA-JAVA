/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree1;

import java.util.*;

/**
 *
 * @author Aditya
 */
public class j_RootToNodePAth_search {
    
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
    
    public static ArrayList<Integer> rootToNodePath(BinaryTreeNode<Integer> root ,int x){
        if(root==null){
            return null;
        }
                    ArrayList<Integer> output=new ArrayList<>();

        if(root.data==x){
            output.add(root.data);
            return output;
        }
        ArrayList<Integer> leftoutput=rootToNodePath(root.left, x);
        if(leftoutput!=null){
            leftoutput.add(root.data);
            return leftoutput;
        }
        ArrayList<Integer> rightoutput=rootToNodePath(root.left, x);
        if(rightoutput!=null){
            rightoutput.add(root.data);
            return rightoutput;
        }
        return null;
    }
    public static void main(String[] args){
        BinaryTreeNode<Integer> root=takeTreeinputBetter(true, 0, true);
        ArrayList<Integer> path=rootToNodePath(root, 4);
        if(path==null){
            System.out.println("Not FOUND");
        }
        for(int i:path){
            System.out.println(i);
        }
    }
    
}
