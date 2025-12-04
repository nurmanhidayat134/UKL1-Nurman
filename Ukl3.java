/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl3;

/**
 *
 * @author nurmanhidayatarifka
 */
import java.util.Scanner;

public class Ukl3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] pecahan = {100000, 50000, 20000, 5000, 2000, 1000};
        
        System.out.print("Masukkan jumlah uang (rupiah) : ");
        int jumlah = input.nextInt();
        
        System.out.println("\nHasil pecahan : ");
        
        for (int p : pecahan) {
            int lembar = jumlah / p;
            if (lembar > 0) {
                System.out.println(lembar + " Lembar " + p);
            }
            jumlah = jumlah % p;
        }
    }
}
