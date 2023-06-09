
import java.util.Scanner;

class ConvertNumber {

    public static final char CHAR_55 = 55;

    public static void main(String[] args) {
        //int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = sc.nextInt();
        System.out.println("So " + n + " trong he co so 2 = " + ConvertNumber.convertNumber(n, 2));
        System.out.println("So " + n + " trong he co so 16 = " + ConvertNumber.convertNumber(n, 16));
        //System.out.println("So " + n + " trong he co so 8 = "+ ConvertNumber.convertNumber(n, 8));
        //System.out.println("So " + n + " trong he co so 10 = "+ ConvertNumber.convertNumber(n, 10));

    }

    /**
     * chuyen doi so nguyen n sang he co so b
     *
     * @author viettuts.vn
     * @param n: so nguyen
     * @param b: he co so
     * @return he co so b
     */
    public static String convertNumber(int n, int b) {
        if (n < 0 || b < 2 || b > 16) {
            return "Invaild";
        }

        StringBuilder sb = new StringBuilder();
        int m;
        int remainder = n;

        while (remainder > 0) {
            if (b > 10) {
                m = remainder % b;
                if (m >= 10) {
                    sb.append((char) (CHAR_55 + m));
                } else {
                    sb.append(m);
                }
            } else {
                sb.append(remainder % b);
            }
            remainder = remainder / b;
        }
        return sb.reverse().toString();
    }
}
/*import java.util.Scanner;

public class ConvertNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n:");

        try {
            int n = sc.nextInt();
            String binary = Integer.toBinaryString(n);
            String hexal = Integer.toHexString(n);
            if (n > 0) {
                System.out.println("Binary representation: " + binary);
                System.out.println("Hexal representation: " + hexal);

            }
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}*/
