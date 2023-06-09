package DTO;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Statue extends Item {

    private int weight;
    private String colour;

    public Statue() {
    }

    public Statue(int weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void outputStatue() {
        output();
        System.out.println("Weight: " + weight);
        System.out.println("Colour: " + colour);
    }

    public void inputStatue() {
        Scanner sc = new Scanner(System.in);
        input();
        boolean validInput = false;

        do {
            try {
                System.out.print("Enter weight: ");
                weight = Integer.parseInt(sc.nextLine());
                if (weight <= 0) {
                    throw new Exception("Weight must be greater than 0.");
                }
                System.out.print("Enter colour: ");
                colour = sc.nextLine();
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Weight must be a number.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!validInput);

    }

}
