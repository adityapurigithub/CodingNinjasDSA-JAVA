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
public class a_binaryTreeUse { // 95% of tree problem will be solved using recursion as tree are 
    // very recursive in nature.

    public static void printTree(BinaryTreeNode<Integer> root) {
        // base case...
        if (root == null) {
            return;
        }
        
        //preorder....traversing...root->left->right....means (print root call left call right)
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);

      
         
    //postorder traversing...left,right,root......inorder traversing....left,root,right

//        if(root.left!=null){
//        printTree(root.left);

//        if(root.right!=null){
//        printTree(root.right);
    }
    
    public static void printTreeDetailed(BinaryTreeNode<Integer> root){
        if(root==null){ //base case
            return;
        }
        
        //IH
        System.out.print(root.data+" : ");
        if(root.left!=null){
            System.out.print(" L-> "+root.left.data);
        }else{
            System.out.print("L-> Nothing ");
        }
        if(root.right!=null){
            System.out.print(" R-> "+root.right.data);
    }else{
            System.out.print(" R-> Nothing");

        }
        System.out.println();
        
        //IS
        printTreeDetailed(root.left);
        printTreeDetailed(root.right);

    }
    public static int heightOfTree(BinaryTreeNode<Integer>root){
        if(root==null){
            return 0;
        }
        int leftH=heightOfTree(root.left);
        int RightH=heightOfTree(root.right);

        int H=Math.max(leftH, RightH);
        return 1+H;
    }
    public static int largestNode(BinaryTreeNode<Integer> root){
        if(root==null){
            return -1;
        }
        int leftL=largestNode(root.left);
        int rightL=largestNode(root.right);

        int L_among_L_R=Math.max(leftL, rightL);
        
        return Math.max(root.data,L_among_L_R);
        
    }
        
    public static int countLeafNode(BinaryTreeNode<Integer> root){
        if(root==null){  //if no  root means no tree..
            return 0;
        }
        
        if(root.left==null || root.right==null){    // if root 's left-right...is null means only root is there ie. 1 node only and is leaf itself..
            return 1;
        }
        
        int leftL=countLeafNode(root.left);
        int rightL=countLeafNode(root.right);

        return leftL+rightL;
    }
    public static void printAtDepthK(BinaryTreeNode<Integer> root, int k){
       if(root==null){
           return ;
       }
       if(k==0){
           System.out.println(root.data);
           return ;
       }
        printAtDepthK(root.left, k-1);
        printAtDepthK(root.right, k-1);

       
       
       
    }
    
public static void main(String[] args) {
       BinaryTreeNode<Integer> root=new BinaryTreeNode<>(1);
       BinaryTreeNode<Integer> rootL=new BinaryTreeNode<>(2);
       BinaryTreeNode<Integer> rootR=new BinaryTreeNode<>(3);
       root.left=rootL;
       root.right=rootR;

       BinaryTreeNode<Integer> rootLL=new BinaryTreeNode<>(4);
       BinaryTreeNode<Integer> rootLR=new BinaryTreeNode<>(1);
       rootL.left=rootLL;
       rootL.right=rootLR;
//       printTree(root);
        printTreeDetailed(root);
        
        int h=heightOfTree(root);
        
        System.out.println("height->"+h);
        
        int l=largestNode(root);
        System.out.println("largest in the tree->"+l);
        
        int leaves=countLeafNode(root);
        System.out.println("No of Leaf nodes->"+leaves);
        
        System.out.println("node(s) at depth k=2..");
        printAtDepthK(root, 2);
        
        System.out.println("Removed leaf new tree is...");
        BinaryTreeNode<Integer> newRoot=removeLeafNodes(root);
        printTreeDetailed(newRoot);

}

    private static BinaryTreeNode<Integer> removeLeafNodes(BinaryTreeNode<Integer> root) {
        if(root==null){    // if no root return null
            return null;
        }
        if(root.left ==null || root.right==null){   //if only root then it is leaf so remove it ,return null
            return null;
        }
        root.left=removeLeafNodes(root.left);
        root.right=removeLeafNodes(root.right);
    
        return root;
    }

        
    }

}
