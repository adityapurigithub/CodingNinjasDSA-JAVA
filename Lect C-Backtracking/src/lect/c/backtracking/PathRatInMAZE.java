/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lect.c.backtracking;

/**
 *
 * @author Aditya
 */
public class PathRatInMAZE {
    
    public static boolean ratInMaze(int maze[][]){
        int path[][]=new int[maze.length][maze.length];
        
        return ratInAMaze(maze,0,0,path);
	}
    
    public static boolean ratInAMaze(int maze[][],int i,int j,int path[][]){
        
       
        int n=maze.length;
        if(i<0||i>=n||j<0||j>=n||maze[i][j]==0||path[i][j]==1){
            return false;
        }
        path[i][j]=1;
        if(i==n-1&&j==n-1){
            return true;
        }
         boolean top= ratInAMaze(maze,i-1,j,path);
        boolean right= ratInAMaze(maze,i,j+1,path);
        boolean down= ratInAMaze(maze,i+1,j,path);
        boolean left= ratInAMaze(maze,i,j-1,path);
        
        
        return top|| right|| down||left;
   
    }        
    
    public static void PrintPathratInMaze(int maze[][]){
        int path[][]=new int[maze.length][maze.length];
        
        PrintPathratInAMaze(maze,0,0,path);
	}
    
    public static void PrintPathratInAMaze(int maze[][],int i,int j,int path[][]){
        
       
        int n=maze.length;
        if(i<0||i>=n||j<0||j>=n||maze[i][j]==0||path[i][j]==1){
            return ;
        }
        path[i][j]=1;
        if(i==n-1&&j==n-1){
            for(int r=0;r<n;r++){
                for(int c=0;c<n;c++){
                    System.out.println(path[r][c]+" ");
                    
                }
                System.out.println();
                
            }
            path[i][j]=0;
            return;
        }
        PrintPathratInAMaze(maze,i-1,j,path);
         PrintPathratInAMaze(maze,i,j+1,path);
        PrintPathratInAMaze(maze,i+1,j,path);
         PrintPathratInAMaze(maze,i,j-1,path);
        
        
         
         
    }
public static void main(String[] args) {
        int maze[][]={{1,0,1},{1,1,1},{0,0,1}};
//        System.out.println(ratInMaze(maze));
PrintPathratInMaze(maze);

    }
    
}
