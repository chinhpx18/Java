/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day_2;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        // C1: truyen du lieu vao "Student" thong qua contructor
        Student s = new Student("Pham Xuan Chinh", 20);
        System.out.println(s);
        // c2: truyen du lieu vao thong qua setter
    Student s1 = new Student();
    s1.setName("Pham Van B");
    s1.setAge(30);
        System.out.println(s1);
    }
       
}
