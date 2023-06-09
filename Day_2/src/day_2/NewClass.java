/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day_2;

import java.util.Scanner;
import sun.applet.Main;

/**
 *
 * @author Admin
 */
public class NewClass {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String name = sc.nextLine();
        int age = sc.nextInt();
        double gpa= sc.nextDouble();
        System.out.print("Output:\n");
        System.out.println("Hello "+ name);
        System.out.println("Age: "+ age);
        System.out.println("GPA: "+ gpa);
        */
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Input: ");
    String name = sc.next();
    String address = sc.next();
        System.out.print("Output:\n");
        System.out.println("Name: "+ name);   
        System.out.println("Adress: "+ address);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a + b = "+ (a + b));
        boolean d = a > b;
        System.out.println(d);
        char c = (char)(sc.next().charAt(0)+ 2);
        System.out.println(c);
        
   
 
 }
     
}