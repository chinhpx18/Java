
import java.util.Scanner;

public class Check_date_month_year {

    public static void main(String[] args) {
        int month, year;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the month: ");
        month = sc.nextInt();
        System.out.println("Enter a year: ");
        year = sc.nextInt();
        
        switch (month) {
            case 1: 
            case 3: 
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 12:
                System.out.println("Have 31 days");
                break;
                
            case 4: 
            case 6: 
            case 9: 
            case 11:
                System.out.println("Have 30 days");
                break;
                
            case 2: 
                if ((year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0)){
                    System.out.println("Have 29 day");
                }else{
                    System.out.println("Have 28 day");
                }
                break;
                
            default:
                System.out.println("Invalid! Error");
                break;
        }
    }
}