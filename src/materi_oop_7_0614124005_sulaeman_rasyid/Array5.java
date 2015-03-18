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
public class Array5 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0;
        int A[] = new int [8];
        while (i<=7){
            A[i] = i+1;
            i++;
        }
        
        for (i = 0; i <= 7; i++) {
            System.out.print(A[i]+" ");
        }
    }
}
