package day4;

import java.util.Scanner;

public class Exception1 {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        do {
            try {
                System.out.print("Enter n = ");
                n = Integer.parseInt(sc.nextLine());
                if (n < 1 || n > 10) throw new Exception("Error!");
                System.out.println("n = " + n);
                check = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!check);
    }
}