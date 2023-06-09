/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day3;

/**
 *
 * @author Admin
 */
public class Class1 {
    // Tao chuoi
    public static void main(String[] args) {
    // •Sử dụng toán tử "+":    
    String str1 = "Hello";
    String str2 = "world";
    String myString = str1 + " " + str2;
    System.out.println(myString);
       // •Sử dụng phương thức concat
    String str3 = "Code";
    String str4 = "learn.io";
    String myString1 = str3.concat(" ").concat(str4);
        System.out.println(myString1);
        
        
      // Cac ham co ban cua lop String:
      //•length(): Phương thức này trả về độ dài của chuỗi.
      String myString3 = "Hello world!";
      int lenght = myString3.length();
        System.out.println(lenght());
      
  }

    private static boolean lenght() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}