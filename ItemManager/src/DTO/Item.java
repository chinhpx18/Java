/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Item {

    private int value;
    private String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
       do {
            try {

                System.out.print("Enter item value: ");
                value = Integer.parseInt(sc.nextLine());
              
            } catch (Exception e) {
                System.out.println("Error");
            }

        } while (value <= 0);

        do {
            try{
                System.out.print("Enter item creator: ");
                creator = sc.nextLine();

            }
            catch (Exception e1){
                System.out.println("Please enter again");
            }
        } while (creator.isEmpty());
    }

    public void output() {
        System.out.println("Value: " + this.getValue());
        System.out.println("Creator: " + this.getCreator());
    }
}
