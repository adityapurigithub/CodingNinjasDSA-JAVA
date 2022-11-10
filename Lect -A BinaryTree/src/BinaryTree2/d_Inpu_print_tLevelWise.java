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
public class d_Inpu_print_tLevelWise {
    public static BinaryTreeNode<Integer> inputLevelWise(){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter rootdata");
        int rootdata=s.nextInt();
        if(rootdata==-1){
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootdata);
        Queue<BinaryTreeNode<Integer>> q=new LinkedList<BinaryTreeNode<Integer>>();
        q.add(root);
        while(!q.isEmpty()){
            BinaryTreeNode<Integer> front=q.poll();
            System.out.println("Enter leftChild of "+front.data);
            int left=s.nextInt();
            if(left!=-1){
                BinaryTreeNode<Integer> leftchild=new BinaryTreeNode<>(left);
                front.left=leftchild;
                q.add(leftchild);
            }
            System.out.println("Enter rightChild of "+front.data);
            int right=s.nextInt();
            if(right!=-1){
                BinaryTreeNode<Integer> rightchild=new BinaryTreeNode<>(right);
                front.right=rightchild;
                q.add(rightchild);
            }
        }
        return root;
    }
    public static void printLevelWise(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        Queue<BinaryTreeNode<Integer>> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            BinaryTreeNode<Integer> firstNode=q.poll();
            System.out.println(firstNode.data);
            if(firstNode.left==null){
                System.out.println(":L:"+-1);
            }
            else{
                q.add(firstNode.left);
                System.out.println(":L:"+firstNode.left.data);
            }
            if(firstNode.right==null){
                System.out.println(":R:"+-1);
            }
            else{
                q.add(firstNode.right);             
                System.out.println(":R:"+firstNode.right.data);
            }
        }
    }
    public static void main(String[] args){
        BinaryTreeNode<Integer> root=inputLevelWise();
        printLevelWise(root);
        
    }
}
