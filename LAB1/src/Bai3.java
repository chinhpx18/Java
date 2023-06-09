
import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        String[] list = new String[10];
         // Input the list of names
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the list of names: ");
        // Convert all names to uppercase
        for(int i = 0; i < 10; i++){
            list[i] = sc.nextLine().toUpperCase();
        }
        // Sort the list in ascending order
        Arrays.sort(list, (a,b) -> a.compareTo(b));
     
        System.out.println("\nSorted List (Ascending Order):");
        for(int i = 0; i < 10; i++){
            System.out.println(list[i]);
          
        }
    }
}
        
      
