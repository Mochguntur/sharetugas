/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author VivoBook
 */
import java.util.*;
public class Tugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nama;
        String judul;
        String pinjam;
        
        int nim;
        int kode;
        int jumlah;
        
        //membuat objek dari class scanner
        Scanner input = new Scanner (System.in);
        
        //tampilkan output
        System.out.println("== DATA MAHASISWA ==");
        
        System.out.println("NAMA MAHASISWA");
        nama = input.next();
        
        System.out.println("NIM");
        nim = input.nextInt();
        
        System.out.println("== DATA BUKU ==");
        
        System.out.println("KODE BUKU");
        kode = input.nextInt();
        
        System.out.println("JUDUL BUKU");
        judul = input.next();
        
        System.out.println("== DATA TRANSAKSI ==");
        
        System.out.println("NIM");
        nim = input.nextInt();
        
        System.out.println("NAMA MAHASISWA");
        nama = input.next();
        
        System.out.println("JUMLAH BUKU YANG DIPINJAM");
        jumlah = input.nextInt();
        
        System.out.println("JUDUL BUKU YANG DIPINJAM");
        pinjam = input.next();
        
        System.out.println("===============");
        System.out.println("NAMA MAHASISWA :" + nama);
        System.out.println("NIM :" + nim);
        System.out.println("KODE BUKU :" + kode);
        System.out.println("JUDUL BUKU :" + judul);
        System.out.println("JUMLAH BUKU YANG DIPINJAM :" + jumlah);
        System.out.println("JUDUL BUKU YANG DIPINJAM :" + pinjam);
    }
    
}
