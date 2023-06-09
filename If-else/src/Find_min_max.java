
//Ví dụ dưới đây sẽ so sánh 2 số và hiển thị ra màn hình số nhỏ nhất trong 2 số.
import java.util.Scanner;

public class Find_min_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = 1;
        if(a > b){
            min = b;
        }else{
            min = a;
        }
        System.out.println(min);
    }
}
