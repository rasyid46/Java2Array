/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package materi_oop_7_0614124005_sulaeman_rasyid;

import java.util.Scanner;

/**
 *
 * @author Sulaeman Rasyid
 */
public class Tabel {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        int A[] = new int[5];
        int B[] = new int[5];
        int A2[] = new int[5];
        int B2[] = new int[5];
        String type[] = new String[5];
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Masukkan nilai array A : ");
            for (int i = 0; i < A.length; i++) {
                System.out.print("A[" + i + "] = ");
                A[i] = input.nextInt();
            }
            System.out.println("Masukkan nilai array B : ");
            for (int i = 0; i < A.length; i++) {
                System.out.print("B[" + i + "] = ");
                B[i] = input.nextInt();
            }
        } catch (Exception e) {
        }
        int idx = A.length - 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                type[i] = "Genap";
                System.out.println("genap == " + type[i]);
            } else {
                type[i] = "Ganjil";
            }
            A2[i] = A[idx];
            B2[i] = B[idx];
            idx--;
        }

        System.out.print("|---------------------------------------------------------------|\n");
        System.out.print("|  No  |  A  |  B  |  A (Ganjil/Genap)  |  A'  |  B'  |  A'+B'  |\n");
        System.out.print("|---------------------------------------------------------------|\n");

        for (int i = 0; i < A.length; i++) {
            int jml;
            jml = A2[i] + B2[i];
            System.out.print("|  " + (i + 1) + "   " + "|  " + A[i] + "  " + "|  " + B[i]);
            System.out.print("  " + "|    " + type[i] + "\t\t" + "|  " + A2[i] + "   " + "|  " + B2[i] + "   " + "|  " + jml + "  \t|\n");
        }
        System.out.print("|---------------------------------------------------------------|\n");

    }
}
