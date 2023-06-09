
import java.util.Scanner;


public class Slot6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student1 sv3 = new Student1();
        System.out.println("sv3.name"+ sv3.getName());
        System.out.println("sv3.id"+ sv3.getId());
        System.out.println("sv3.score"+ sv3.getScore());
        System.out.println("sv3.age"+ sv3.getAge());
        System.out.println("sv3.address"+ sv3.getAddress());
        System.out.println("Enter the new id: ");
        int id = sc.nextInt();
        sv3.setId(id);
        System.out.println("sv3.id new "+sv3.getId());
    }
}
