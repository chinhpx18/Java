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
public class Main1 {

    public static void main(String[] args) {
        //Lay du lieu thong qua getter
       Student s1 = new Student("Pham Van B", 30);
        String name = s1.getName();
        int age = s1.getAge();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

     
    }
}
