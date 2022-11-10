/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_objects;

/**
 *
 * @author Aditya
 */
public class f_FinalKeyword {
    final private int rollno;
    String name;
    double cgpa;
    
    final double CONVERSION_FACTOR=0.95; //naming convention CapitalLetter
    
       // final keyword means that no one can change the value of a final variable..
      // variable with final keword should always have a value assigned and cant be changed.

    public f_FinalKeyword(int rollno,String name,double cgpa) {
        this.rollno = rollno;
        this.name=name;
        this.cgpa=cgpa;
        
    }
    public void show(){
        System.out.println(rollno+" "+name+" "+cgpa);
    }
    
    
}
class finalmain{
    
    public static void main(String [] args){
        f_FinalKeyword f=new f_FinalKeyword(1, "Aditya", 7.6);
        f.show();
        f_FinalKeyword f1=new f_FinalKeyword(2, "Abhi", 7.4);
        f1.show();
        f_FinalKeyword f2=new f_FinalKeyword(3, "Ankky", 7.0);
        f2.show();
        
    }

}
