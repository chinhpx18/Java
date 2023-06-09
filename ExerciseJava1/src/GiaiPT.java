
import static java.lang.Math.sqrt;
import java.util.Scanner;

//Viết chương trình giải phương trình bậc 2 trong java. Phương trình bậc 2 có dạng:
// ax^2 + bx + c = 0
public class GiaiPT {
        //khai bao bien
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = sc.nextInt();
        System.out.println("Input b: ");
        int b = sc.nextInt();
        System.out.println("Input c: ");
        int c = sc.nextInt();

        // Check a,b,c
        if (a == 0) {
            if (b == 0) {
                System.out.println("The equation no solution");
            } else {
                System.out.println("The equation have a solution: " + "x = " + (-c / b));
            }
            return;
        }
        //Tinh Delta
        float delta = b * b - 4 * a * c;
        float x1, x2;
        if (delta > 0) {
            x1 = (float) ((-b + sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - sqrt(delta)) / (2 * a));
            System.out.println("The equation have solution:\n" + "x1 = " + x1 + "\n" + "x2 = " + x2);
        } else if (delta == 0) {
            x1 = (float) (-b / (2 * a));
            System.out.println("The equation have a solution:\n" + " x1 = x2 = " + x1);
        } else {
            System.out.println("The equation no solution");
        }
    }
}
