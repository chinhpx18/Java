/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Import {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Input your name:");
        String name = sc.nextLine();
        System.out.println("name: "+name);
        
        System.out.print("Input your age: ");
        //int age = sc.nextInt();
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("age: "+age);
        
        System.out.print("Input your experience: ");
       //double experience = sc.nextDouble();
       double experience = Double.parseDouble(sc.nextLine());
        System.out.println("eperience: "+experience);
    }
}
