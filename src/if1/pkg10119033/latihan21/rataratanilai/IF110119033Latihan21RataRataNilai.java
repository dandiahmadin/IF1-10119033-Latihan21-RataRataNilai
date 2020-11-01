/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119033.latihan21.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi menghitung nilai rata-rata
 */
public class IF110119033Latihan21RataRataNilai {

    /**
     * @param args the command line arguments
     */
    
    static int banyakMhs, nilaiMhs[], jumlahNilai;
    static Scanner scanner = new Scanner (System.in);
    
    static void inputJumlahMhs() {
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        banyakMhs = scanner.nextInt();
    }
    
    static void inputNilaiMhs() {
        nilaiMhs = new int[banyakMhs];
        for (int i = 0; i <nilaiMhs.length ; i++) {
            System.out.print("Nilai Mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = scanner.nextInt();
            jumlahNilai = penjumlahNilai(jumlahNilai, nilaiMhs[i]);
        }
       
    }
    
    static int penjumlahNilai(int paramJumlahNilai, int paramNilai) {
        return paramJumlahNilai += paramNilai;
    }
    
    static double hitungRataRata(double paramJumlahNilai, double paramBanyakMhs) {
        double rataNilai = paramJumlahNilai/paramBanyakMhs;
        return rataNilai;
    }
    
    static void tampilHasil(){
        System.out.println("\nMaka, Rata-rata Nilainya adalah " + hitungRataRata(jumlahNilai, banyakMhs) );
        System.out.println("Developed by : Dandi Ahmadin");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        inputJumlahMhs();
        inputNilaiMhs();
        tampilHasil();
    }
    
}
