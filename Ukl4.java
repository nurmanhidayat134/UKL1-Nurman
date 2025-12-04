/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl4;

/**
 *
 * @author nurmanhidayatarifka
 */
public class Ukl4 {

    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 2, 5};
        boolean found = false;
        
       for (int i = 0; i < array.length; i++) {
           for (int j = i + 1; j < array.length; j++) {
               if (array[i] == array[j]) {
                   System.out.println("Array memiliki elemen duplikat : " + array[i]);
                   found = true;
                   break;
               }
           }
           if (found) break;
       } 
       
       if (!found) {
           System.out.println("Array tidak memiliki elemen duplikat.");
       }
    }
}
