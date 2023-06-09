/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author Admin
 */
public class DuyetMang {

    public static void main(String[] args) {
        int[] myArr = {6, 42, 3, 7};
        int sum = 0;
        for (int x = 0; x < myArr.length; x++) {
            sum += myArr[x];
        }
        System.out.println(sum);

        System.out.print("\n");
        // duyet mang bang vong lap while
        String pref[] = {"Java", "PHP", "Python"};

        int i = 0;
        while (i < pref.length) {
            System.out.println(pref[i]);
            i++;
        }
        System.out.print("\n");
        // duyet mang bang vong for
        String prg[] = {"C", "Java", "Python"};

        for (String str : prg) {
            System.out.println(str);
        }
    }
}
// output 58

