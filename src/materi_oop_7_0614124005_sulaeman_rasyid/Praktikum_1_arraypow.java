/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package materi_oop_7_0614124005_sulaeman_rasyid;

/**
 *
 * @author Sulaeman Rasyid
 */
public class Praktikum_1_arraypow {

    public static void main(String[] args) {
        int[] A = new int[11];
        int[] B = new int[11];
        //int [] A = {10, 9, 8, 7, 6, 5};
        double x = 2; //pow

        for (int i = 0; i < A.length; i++) {
            double j = (double) i; // d = 3.0
            double k = Math.pow(x, j);
            int l = (int) k;
            B[i] = l;
        }
        for (int m = 0; m < B.length; m++) {
            System.out.println("Array Elemen KE " + m + " = " + B[m]);
        }
        for (int m = 0; m < B.length; m++) {
            if (m == 5) {
                System.out.println("Arrang Indek ke  " + m + " = " + B[m]);
            }
        }
    }
}
