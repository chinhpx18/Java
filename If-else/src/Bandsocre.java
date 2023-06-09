
import java.util.Scanner;


public class Bandsocre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        float mark = sc.nextFloat();
        if(mark < 6.5 && mark > 5){
            System.out.println("This is the average score");
        }else if(mark > 6.5 && mark < 8 ){
            System.out.println("This is a good score");
        }else if(mark > 8 && mark <= 10){
            System.out.println("This is a excellent socre");
        }else{
            System.out.println("This is a score below average, low!");
        }
    }
}
