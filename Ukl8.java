/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl8;

/**
 *
 * @author nurmanhidayatarifka
 */
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Ukl8 {

    public static void main(String[] args) {
        class Cookie {
    String nama;
    int hargaProduksi;
    int hargaJual;
    int jumlahTerjual;
    int totalBiaya;
    int totalPendapatan;
    int labaRugi;
    String status;

    public Cookie(String nama, int hargaProduksi, int hargaJual, int jumlahTerjual) {
        this.nama = nama;
        this.hargaProduksi = hargaProduksi;
        this.hargaJual = hargaJual;
        this.jumlahTerjual = jumlahTerjual;
        hitung();
    }

    private void hitung() {
        totalBiaya = hargaProduksi * jumlahTerjual;
        totalPendapatan = hargaJual * jumlahTerjual;
        labaRugi = totalPendapatan - totalBiaya;

        if (labaRugi > 0) {
            status = "Laba";
        } else if (labaRugi < 0) {
            status = "Rugi";
        } else {
            status = "Impas";
        }
    }
}

        Scanner input = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

        System.out.print("Masukkan jumlah jenis cookies: ");
        int jumlahCookies = input.nextInt();
        input.nextLine(); 

        ArrayList<Cookie> daftarCookies = new ArrayList<>();

        for (int i = 0; i < jumlahCookies; i++) {
            System.out.println("\nCookies ke-" + (i + 1) + ":");

            System.out.print("Nama cookies: ");
            String nama = input.nextLine();

            System.out.print("Harga produksi per bungkus: ");
            int hargaProduksi = input.nextInt();

            System.out.print("Harga jual per bungkus: ");
            int hargaJual = input.nextInt();

            System.out.print("Jumlah terjual: ");
            int jumlahTerjual = input.nextInt();
            input.nextLine(); 

            daftarCookies.add(new Cookie(nama, hargaProduksi, hargaJual, jumlahTerjual));
        }

        
        System.out.println("\n-----------------------------------------------------------");
        System.out.printf("%-18s | %-13s | %-16s | %-10s | %-5s\n", 
                          "Nama Cookies", "Total Biaya", "Total Pendapatan", "Laba/Rugi", "Status");
        System.out.println("-----------------------------------------------------------");

        int totalLabaRugi = 0;
        Cookie cookieLabaTertinggi = null;

        for (Cookie c : daftarCookies) {
            totalLabaRugi += c.labaRugi;

            if (cookieLabaTertinggi == null || c.labaRugi > cookieLabaTertinggi.labaRugi) {
                cookieLabaTertinggi = c;
            }

            System.out.printf("%-18s | %-13s | %-16s | %-10s | %-5s\n",
                    c.nama, nf.format(c.totalBiaya), nf.format(c.totalPendapatan), 
                    nf.format(c.labaRugi), c.status);
        }

        System.out.println("-----------------------------------------------------------");
        System.out.println("Total Laba/Rugi Keseluruhan: " + nf.format(totalLabaRugi));

        if (cookieLabaTertinggi != null) {
            System.out.println("Cookies dengan Laba Tertinggi: " + cookieLabaTertinggi.nama + " (" + nf.format(cookieLabaTertinggi.labaRugi) + ")");
        }

       
    }
}
    

