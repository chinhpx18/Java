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
public class Vase extends Item {
    int height;
    String material;

    public Vase() {
    }

    public Vase(int value, String creator,int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    public void inputVase (){       
         Scanner sc=new Scanner(System.in);
         input();
         boolean validInput = false;

do {
    try {
        System.out.print("Enter height : ");
        height = Integer.parseInt(sc.nextLine());
        if (height <= 0) {
            throw new Exception("Invalid input. Height must be greater than 0.");
        }
        System.out.print("Enter material: ");
        material = sc.nextLine();
        validInput = true;
    } catch (NumberFormatException e) {
        System.out.println("Invalid input. Height must be an integer.");
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
} while (!validInput);
        
    }
    
    public void outputVase() {
        System.out.println("Height: " + height);
        System.out.println("Material: " + material);
    }
}