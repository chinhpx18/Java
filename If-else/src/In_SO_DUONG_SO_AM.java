
// 1, Viết chương trình java nhập vào một số nguyên a 
//là in ra “so duong” nếu a > 0, “so am” nếu a < 0.
import java.util.Scanner;

public class In_SO_DUONG_SO_AM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = sc.nextInt();
        if(a > 0){
            System.out.println("a la so duong");
        }else{
            System.out.println("a la so am");
        }
    }
}
