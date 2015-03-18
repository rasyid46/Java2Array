/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package materi_oop_7_0614124005_sulaeman_rasyid;

/**
 *
 * @author Sulaeman Rasyid
 */
public class Array6 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A[] = {1,2,3,4,5}; int B[] = new int[5];
        int i=0, j=(A.length-1);
        
        System.out.println("Nilai Asli");
        for (i = 0; i <= 4; i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Nilai Dibalik");
        for (i = 0; i <= 4; i++) {
            B[i] = A[j];
            System.out.print(B[i]+ " ");
            j--;
        }
    }
}