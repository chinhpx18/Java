package Array;


import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Array {

    public static void main(String[] args) {
        String[] cars = {"Vinfast", "BMW", "Ford", "Mazda"};
        System.out.println(cars[3]);
        System.out.println(cars.length);// độ dài của mảng

        Arrays.sort(cars);//sx mang theo thu tu tang dan
        System.out.println("Array after sorted: ");
        for (String car : cars) {
            System.out.println(car);
        }
        System.out.print("\nCopy in java: ");
        // copy in java
        char[] copyFrom = {'d', 'e', 'l', 'a', 'p',
            't', 'r', 'i', 'n', 'h', 'j', 'a', 'v', 'a'};
        char[] copyTo = new char[14];

        System.arraycopy(copyFrom, 2, copyTo, 0, 8);
        System.out.println(new String(copyTo));
    }
}
