/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119083.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @Nama     : Rafsan Zen Mustaofa
 * NIM       : 10119083
 * Kelas     : IF2
 * Deskripsi : Menampilkan program tabungan
 */
public class PBOIF210119083Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        Tabungan tabungan = new Tabungan();
        
        int kredit;
        
        System.out.println("=====Program Penarikan Uang=====");
        System.out.println("Masukan saldo Awal : " ); tabungan.Tabungan(scanner.nextInt());
        System.out.printf("Jumlah uang yang diambil : "); kredit = scanner.nextInt();
        System.out.printf("Saldo Anda Sekarang : %d\n",tabungan.tarik(kredit));
        
        System.out.println("==========================================");
        System.out.println("Developed by : Rafsan Zen Mustaofa");
    }
    
}
