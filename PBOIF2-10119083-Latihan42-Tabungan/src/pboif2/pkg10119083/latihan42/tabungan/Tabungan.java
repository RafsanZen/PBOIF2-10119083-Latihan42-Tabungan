/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119083.latihan42.tabungan;

/**
 *
 * @Nama     : Rafsan Zen Mustaofa
 * NIM       : 10119083
 * Kelas     : IF2
 * Deskripsi : Menampilkan program untuk Tabungan
 */
public class Tabungan {
     private int saldo;
    
    public void Tabungan(int saldo){
        this.saldo = saldo;
    }
    
    public int tarik(int jumlah){
        return this.saldo - jumlah;
    }}
