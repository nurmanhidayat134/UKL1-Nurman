/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl5;

/**
 *
 * @author nurmanhidayatarifka
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ukl5 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        ArrayList<Integer> riwayatKomputer = new ArrayList<>();
        ArrayList<Integer> riwayatPemain = new ArrayList<>();
        
        int skorKomputer = 0;
        int skorPemain = 0;
        
        System.out.println("=== PERMAINAN LEMPAR DADU ===");
        System.out.println("Pemenang adalah yang pertama mencapai 5 kemenangan!");
        System.out.println("----------------------------------------------");
        
        while (skorKomputer < 5 && skorPemain < 5) {
            
            System.out.print("\nTekan tombol apa saja lalu ENTER untuk melempar dadu : ");
            input.nextLine();
            
            int daduKomputer = rand.nextInt(6) + 1;
            riwayatKomputer.add(daduKomputer);
            
            int daduPemain = rand.nextInt(6) + 1;
            riwayatPemain.add(daduPemain);
            
            System.out.println("Dadu Komputer : " + daduKomputer);
            System.out.println("Dadu Pemain   : " + daduPemain);
            
            if (daduPemain > daduKomputer) {
                skorPemain++;
                System.out.println("Pemain menang di ronde ini!");
            } else if (daduKomputer > daduPemain) {
                skorKomputer++;
                System.out.println("Komputer menang di ronde ini!");
            } else {
                System.out.println("Seri!");
            }
            
            System.out.println("Skor sementara > Pemain : " + skorPemain + " | Komputer : " + skorKomputer);
        }
        
        System.out.println("\n======================================");
        System.out.println("PERMAINAN SELESAI!");
        
        if (skorPemain == 5) {
            System.out.println("Pemenangnya adalah PEMAIN!");
        } else {
            System.out.println("Pemenangnya adalah KOMPUTER!");
        }
        
        System.out.println("\n--- Rekap Semua Lemparan ---");
        
        System.out.println("Riwayat lemparan komputer : " + riwayatKomputer);
        System.out.println("Riwayat lemparan pemain  : " + riwayatPemain);

        System.out.println("\nTotal kemenangan:");
        System.out.println("Komputer : " + skorKomputer);
        System.out.println("Pemain   : " + skorPemain);

        System.out.println("======================================");
    }
}
