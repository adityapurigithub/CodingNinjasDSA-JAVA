/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lect7_forLoop;

import java.util.Scanner;

/**
 *
 * @author Aditya
 */
public class z_Ncr_forloop {
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int r=s.nextInt();
        int factN=1;
        
        
        for (int i=1;i<=n;i++){
            factN=factN*i;
        }
        int factR=1;
        for(int i=1;i<=r;i++){
            factR=factR*i;
        }
        int factNR=1;
       for(int i=1;i<=(n-r);i++){
           factNR=factNR*i;
       }
       int ans=(factN/(factR*factNR));
       System.out.println(ans);
    }     // this way is so repetitive or redundant way...which is not a good code ...
            // The major concern with redundant code are repetition,readability,testability....So we use function..
    
}


//  ANOTHER WAYS OF NCR
//    int n=10,r=6;
//    int factn=1,factr=1,factnr=1;
//    for(int i=2;i<=n;i++)
//    {
//        factn*=i;
//        if(i<=r)
//            factr*=i;
//        if(i<=n-r)
//            factnr*=i;
//    }
//    int ncr=factn/(factr*factnr);
//    System.out.print(ncr);
//}