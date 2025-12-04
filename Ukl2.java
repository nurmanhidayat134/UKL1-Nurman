/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl2;

/**
 *
 * @author nurmanhidayatarifka
 */
import java.util.Scanner;

public class Ukl2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;

        
        do {
            System.out.print("Masukkan sebuah bilangan (1 - 50): ");
            angka = input.nextInt();

            if (angka < 1 || angka > 50) {
                System.out.println("Input harus antara 1 sampai 50. Silakan coba lagi.");
            }
        } while (angka < 1 || angka > 50);

        
        if (angka <= 1) {
            System.out.println(angka + " bukan bilangan prima.");
        } else {
            boolean prima = true;

            for (int i = 2; i <= angka / 2; i++) {
                if (angka % i == 0) {
                    prima = false;
                    break;
                }
            }

            if (prima) {
                System.out.println(angka + " adalah bilangan prima.");
            } else {
                System.out.println(angka + " bukan bilangan prima.");
            }
        }
    }
}
