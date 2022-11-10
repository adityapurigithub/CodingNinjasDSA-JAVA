/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zPractice;

/**
 *
 * @author Aditya
 */
public class string {

    // Replacing  X Char with Y..........................................
    public static String replaceChar(String str, char x, char y) {
        if (str.length() == 0) {
            return str;
        }
        String smallStr = replaceChar(str.substring(1), x, y);
        if (str.charAt(0) == x) {
            return y + smallStr;
        } else {
            return str.charAt(0) + smallStr;
        }
    }
    
    // Removing X from the String.....................
    public static String removeX(String str, char x) {
        if (str.length() == 0) {
            return str;
        }
        String smallStr = removeX(str.substring(1), x);
        if (str.charAt(0) == x) {
            return smallStr;
        } else {
            return str.charAt(0) + smallStr;
        }
    }
    
    //REPLACE Pi With 3.14...........................................
    public static String replacePi(String str){
        if(str.length()<=1){
            return str;
        }
        else if(str.charAt(0)=='p' && str.charAt(1)=='i'){
            String smallOp=replacePi(str.substring(2));
            return "3.14"+smallOp;
        }else{
            String smallOp=replacePi(str.substring(1));
            return str.charAt(0)+smallOp;
        }
    }
    //.Remove Duplicate Char Recursively............................
    public static String removeDuplicate(String str){
        if(str.length()<=1){
            return str;
        }
        if(str.charAt(0)==str.charAt(1)){
            return removeDuplicate(str.substring(1));
        }else{
            return str.charAt(0)+removeDuplicate(str.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(replaceChar("abcxdxhgxlbx", 'x', 'y'));

        String removeXans = removeX("adixtyaxpuri", 'x');
        System.out.println(removeXans);

        String replacePians = replacePi("apbpizxpiwerp");
        System.out.println(replacePians);
        
        String removeDup=removeDuplicate("abccdbgdc");
        System.out.println(removeDup);

    }

}
