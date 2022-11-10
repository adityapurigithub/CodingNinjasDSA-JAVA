/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z;

/**
 *
 * @author Aditya
 */
public class countWordsInStr {
    public static int countWords(String str){
        int length=str.length();
        if(length==0){
            return 0;
        }
        int count=0;
        for(int i=0;i<length;i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        return count+1;
    }
    public static void main(String []args){
        String str="No one Likes you When you 23";
        int words=countWords(str);
        System.out.println(words);
    }
}
