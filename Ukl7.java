/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl7;

/**
 *
 * @author nurmanhidayatarifka
 */
import java.util.Scanner;

public class Ukl7 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        System.out.print("Nama peminjam       : ");
        String nama = input.nextLine();

        System.out.print("Judul buku          : ");
        String judul = input.nextLine();

        System.out.print("Kategori buku (A/B/C): ");
        char kategori = input.next().charAt(0);

        System.out.print("Lama peminjaman (hari): ");
        int hari = input.nextInt();

        
        int biayaPerHari = 0;

        switch (Character.toUpperCase(kategori)) {
            case 'A':
                biayaPerHari = 2000;  
                break;
            case 'B':
                biayaPerHari = 1500;  
                break;
            case 'C':
                biayaPerHari = 1000;  
                break;
            default:
                System.out.println("Kategori tidak valid!");
                return;
        }

        
        int biayaAwal = biayaPerHari * hari;

        
        int denda = 0;
        if (hari > 7) {
            int hariTerlambat = hari - 7;
            denda = hariTerlambat * 500;
        }

        
        int totalBiaya = biayaAwal + denda;

        
        System.out.println("\n===== DETAIL PEMINJAMAN =====");
        System.out.println("Nama peminjam      : " + nama);
        System.out.println("Judul buku         : " + judul);
        System.out.println("Kategori buku      : " + kategori);
        System.out.println("Lama peminjaman    : " + hari + " hari");
        System.out.println("Biaya awal         : Rp " + biayaAwal);
        System.out.println("Denda keterlambatan: Rp " + denda);
        System.out.println("Total biaya        : Rp " + totalBiaya);

    }
}
