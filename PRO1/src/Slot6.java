
import java.util.Scanner;


public class Slot6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student sv1 = new Student();
        System.out.println("sv1.name"+ sv1.getName());
        System.out.println("sv1.id"+ sv1.getId());
        System.out.println("Enter the new ID: ");
        int id = sc.nextInt();
        sv1.setId(id);
        System.out.println("sv1.id new "+sv1.getId());
        
        Student sv2 = new Student(256, "Nguyen Van A");
        System.out.println(sv2.getId() + " | "+ sv2.getName());
        System.out.println(sv2);
    }
}
