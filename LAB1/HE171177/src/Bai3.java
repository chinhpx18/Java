
//import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    static void sortList(String[] list) {
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (list[i].compareTo(list[j]) > 0) {
                    String temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] list = new String[5];

        // Input the list of names
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the list of names: ");
        // Convert all names to uppercase
        for (int i = 0; i < 5; i++) {
            list[i] = sc.nextLine().toUpperCase();

        }
        // Sort the list in Ascending order
        // Arrays.sort(list, (a,b) -> a.compareToarr(b));
        sortList(list);
        System.out.println("\nSorted List (Ascending Order):");
        for (int i = 0; i < 5; i++) {
            System.out.println(list[i]);

        }
    }
}
