/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl6;

/**
 *
 * @author nurmanhidayatarifka
 */
import java.util.Random;
import java.util.Scanner;

public class Ukl6 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        while (true) {
            int a = rand.nextInt(10) + 1;   
            int b = rand.nextInt(10) + 1;   

            int operatorRandom = rand.nextInt(3); 

            String operator = "";
            int jawabanBenar = 0;

            
            if (operatorRandom == 0) {
                operator = "*";
                jawabanBenar = a * b;

            } else if (operatorRandom == 1) {
                
                a = a * b;
                operator = "/";
                jawabanBenar = a / b;

            } else {
                operator = "%";
                jawabanBenar = a % b;
            }

            
            System.out.print(a + " " + operator + " " + b + " = ");

            
            int jawabanUser = input.nextInt();

            
            if (jawabanUser == jawabanBenar) {
                System.out.println("Benar!\n");
            } else {
                System.out.println("Salah! Jawaban yang benar: " + jawabanBenar + "\n");
            }

            
            System.out.print("Lanjut kuis? (y/n): ");
            String lanjut = input.next();

            if (lanjut.equalsIgnoreCase("n")) {
                System.out.println("\nKuis berhenti. Terima kasih!");
                break;
            }

            System.out.println();
            
        }
        
        input.close();
    }
}
                
            
            
            
        
        
    

