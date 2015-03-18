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
public class Paraktikum_2_array_keyboard {

     public static void main(String[] args) {
        // TODO code application logic here
        int A[] = new int[11];//{1,2,4,8,16,64,128,256,512,1024};
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Masukkan nilai array : ");
            for (int i = 0; i < A.length; i++) {
                System.out.print("A[" + i + "] = ");
                A[i] = input.nextInt();
            }
        } catch (Exception e) {
        }

        System.out.println("\n------------------------------\nNilai array adalah : ");
        for (int i = 0; i < A.length; i++) {
            System.out.println("A["+i+"] = " + A[i]);
        }

    }
}
