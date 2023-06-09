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
public class Painting extends Item {

    private int height;
    private int width;
    boolean isWatercolour;
    boolean isFramed;

    public Painting() {
    }

    public Painting(int value, String creator, int height, int width, boolean isWatercolour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }

    public void outputPainting() {
        output();
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
    }

    public void inputPainting() {
        Scanner sc = new Scanner(System.in);
        input();
        boolean validInput = false;

        do {
            try {
                System.out.print("Enter height: ");
                height = Integer.parseInt(sc.nextLine());
                if (height <= 0) {
                    throw new Exception("Height must be a positive integer.");
                }
                System.out.print("Enter width: ");
                width = Integer.parseInt(sc.nextLine());
                if (width <= 0) {
                    throw new Exception("Width must be a positive integer.");
                }
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Please enter an integer.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!validInput);
    }
}
