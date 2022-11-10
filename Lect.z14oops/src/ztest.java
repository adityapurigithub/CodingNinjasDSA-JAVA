///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
///**
// *
// * @author Aditya
// */
//
//    class A{
//   A(){
//        System.out.print("first ");
//    }
//}
//class B extends A{
//    B(){
//        System.out.print("second ");
//    }
//}
//class C extends B{
//    C(){
//        System.out.print("third ");
//    }
//}
//class ztest{
//    public static void main (String[] args) {
//        C c=new C();
//    }
//}
//    
//}
//class Car{
//    String color;
//    double price;
//}
//public class ztest {
//    public static void main(String[] args) {
//        Car c = new Car();
//        c.color="black";
//     
//        //Figure out the correct statement to set color of the car object referred by c to “black”
//    }
//}

class Student{
    String name;
    int rollNo;
    Student(int n){
    rollNo = n;
    }   
    void print(){
    System.out.print(rollNo +" " + name+" ");
    }
}

public class ztest {
    public static void main(String[] args) {
    Student s = new Student(56);
    s.print();
    }
}   