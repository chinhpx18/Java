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
public class Employee {
    private String mane;
    private int age;
// ctrl + space
    public Employee() {
    }
    public Employee(String mane, int age) {
        this.mane = mane;
        this.age = age;
    }
// click mouse right + insert code + getter and setter
    public String getMane() {
        return mane;
    }

    public void setMane(String mane) {
        this.mane = mane;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
// ctrl + space + toString
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
