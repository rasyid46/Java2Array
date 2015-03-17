/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package materi_oop_7_0614124005_sulaeman_rasyid;

import java.util.Scanner;

/**
 *
 * @author uyee
 */
public class Paraktikum_2_array_keyboard {

    public static void main(String[] args) {
        int[] A = new int[11];
        int[] B = new int[11];
        Scanner reader = new Scanner(System.in);
        for (int i = 0; i < A.length; i++) {
            try {
                char firstInitial =(char)-1;
                firstInitial = (char)System.in.read();
               B[i]= firstInitial;
            } catch (Exception e) {
                System.out.println("error");
            }
        }

        for (int j = 0; j < B.length; j++) {
            System.out.println("ss"+B[j]);
        }
    }
}
