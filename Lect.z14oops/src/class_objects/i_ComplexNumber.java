/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_objects;

import java.util.Scanner;

/**
 *
 * @author Aditya
 */
public class i_ComplexNumber {

    int real;
    int imaginary;
   public i_ComplexNumber(int real,int imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    public void plus(i_ComplexNumber c2){
        this.real=this.real+c2.real;
        this.imaginary=this.imaginary+c2.imaginary;
        this.real=real;
        this.imaginary=imaginary;
}
    public void multiply(i_ComplexNumber c2){
        this. real=(this.real*c2.real) - (this.imaginary*c2.imaginary);
        this.imaginary=(this.real*c2.imaginary) + (this.imaginary*c2.real); 
              // here logic is correct but its giving wrong ans
        this.real=real;
        this.imaginary=imaginary;
    }
    public void print(){
        System.out.println(real+" + i"+imaginary);

    }
    
}
 class mainComplex{
     public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		i_ComplexNumber c1 = new i_ComplexNumber(real1, imaginary1);
		i_ComplexNumber c2 = new i_ComplexNumber(real2, imaginary2);

		int choice = s.nextInt();

		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}
}