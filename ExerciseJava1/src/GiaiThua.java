
import java.util.Scanner;

//Định nghĩa : giai thừa của 1 số là tích các số liên tiếp từ 1 đến số đó. 
//Trường hợp đặc biệt, giai thừa của 0 và 1 là 1.
//Ví dụ: giai thừa của 5 là 1*2*3*4*5 = 120
public class GiaiThua {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        
        long giai_thua = 1;
        if ( n == 0 || n == 1){
            giai_thua = 1;
            System.out.println("Giai thua = "+ giai_thua);
        }else if(n > 1){
            for(int i=2; i<=n; i++){
                giai_thua *=i;
            }
            System.out.println("Giai thua = "+ giai_thua);
        }else{
            System.out.println("Invaild!");
        }
    }
}
        /*long giai_thua = GiaiThua(n);
        System.out.println("Giai thua cua " + n + " la: " + giai_thua);
    }

    static long GiaiThua(int n) {
        long giai_thua = 1;
        if (n == 0 || n == 1) {
            giai_thua = 1;
        } else {
            for (int i = 2; i <= n; i++) {
                giai_thua *= i;
            }
        }
        return giai_thua;
    }
}*/
