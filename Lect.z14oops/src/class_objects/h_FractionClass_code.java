package class_objects;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aditya
 */
public class h_FractionClass_code {
    int numerator;
    int denominator;

    public h_FractionClass_code(int numerator, int denominator) {
    this.denominator=denominator;
    this.numerator=numerator;
    simplyfiyCalculation();
    }

    private void simplyfiyCalculation() {  // simplify the calculation like 6/3 to 2/1
        int gcd=1;
        int smallernum=Math.min(numerator, denominator);
        for(int i=2;i<=smallernum;i++){
            if(numerator%i==0&&denominator%i==0){
                gcd=i;
            }
        }
        numerator=numerator/gcd;
        denominator=denominator/gcd;
    }

   public void print() {
       System.out.println(numerator+"/"+denominator);
   }

    void increment() {
        numerator=numerator+denominator;
        denominator=denominator;
    }

    void setnumerator(int num) { // set denominator but check condtion if its eq to 0 then return..
        this.numerator=num;
    }
    int getnumerator() {
       return numerator; 
    }
    
    void add(h_FractionClass_code o2) {
        this.numerator= this.numerator*o2.denominator + o2.numerator*this.denominator;
        this.denominator=this.denominator+o2.denominator;
//       simplyfiyCalculation();
       
    }
    
    public static h_FractionClass_code fractionAdd(h_FractionClass_code o1, h_FractionClass_code o2){
        int newNum=o1.numerator*o2.denominator + o2.numerator*o1.denominator;
        int newDenomi=o1.denominator+o2.denominator;
        h_FractionClass_code o3= new h_FractionClass_code(newNum,newDenomi);
        return o3;
    }
    }
        


class mainFraction{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        
        h_FractionClass_code o1=new h_FractionClass_code(1,3);
        o1.print();
//        
//        o1.increment();// increment func means adding 1 to fraction
//        o1.print();
//        o1.increment();
//        o1.print();
        
        h_FractionClass_code o2=new h_FractionClass_code(4,9);
        o2.print();
//        int n=s.nextInt();
//        o2.setnumerator(n);
//        o2.getnumerator();
//        o2.print();
         o1.add(o2);
         o1.print();
         
        h_FractionClass_code o3=h_FractionClass_code.fractionAdd(o1, o2);
        o3.print();
        
        
    }

    
}
