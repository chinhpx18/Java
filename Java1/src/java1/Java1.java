
package java1;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0,m;
        do {   
            try{
            n = sc.nextInt();
            m = sc.nextInt();
            float c = (float)n/m;
            break;
            }
            catch(Exception e){
                System.out.println("Sai kieu du lieu");
                sc.nextLine();
            }
            
            finally{
                System.out.println("finally n = "+ n);
            }
        //while (n<Integer.MIN_VALUE || n>Integer.MAX_VALUE);
        }while(true);
        //System.out.println("n = "+ n);
    }
    
    }
