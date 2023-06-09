
import java.util.Scanner;

class Static {

    static void sortList(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        //String[] list = new String[5];
        int[] arr = new int[5];
        // Input the list of names
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the list of names: ");
        // Convert all names to uppercase
        for (int i = 0; i < 5; i++) {
            String[] array = null;
            array[i] = sc.nextLine();
           
        }
        int[] array = null;
        //int[] arr = null;
        // Sort the list in Ascending order
        // Arrays.sort(list, (a,b) -> a.compareToarr(b));
        sortList(array);
        System.out.println("\nSorted List (Ascending Order):");
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
    }
}
