
//kiểm tra số bạn vừa nhập vào là số chẵn hay lẻ.
import java.util.Scanner;

public class Check_odd_even {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int number;
        System.out.println("Input: ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("This is even number");
        } else {
            System.out.println("This is odd number");
        }
    }
}
