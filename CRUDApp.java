/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.crudapp;

/**
 *
 * @author Tsabitah Kawiswara
 */

import java.util.ArrayList;
import java.util.Scanner;

// Kelas untuk merepresentasikan Sepatu
class Sepatu {
    String nama;
    String merk;
    String warna;
    int ukuran;

    public Sepatu(String nama, String merk, String warna, int ukuran) {
        this.nama = nama;
        this.merk = merk;
        this.warna = warna;
        this.ukuran = ukuran;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Merk: " + merk + ", Warna: " + warna + ", Ukuran: " + ukuran;
    }
}
public class CRUDApp {

    public static void main(String[] args) {
        ArrayList<Sepatu> koleksiSepatu = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("--- Manajemen Koleksi Sepatu ---");
            System.out.println("1. Tambah Sepatu");
            System.out.println("2. Tampilkan Semua Sepatu");
            System.out.println("3. Perbarui Sepatu");
            System.out.println("4. Hapus Sepatu");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan Anda: ");

            try {
                pilihan = scanner.nextInt();
                scanner.nextLine(); // Membersihkan newline character

                switch (pilihan) {
                    case 1:
                        System.out.print("Masukkan nama sepatu: ");
                        String nama = scanner.nextLine();
                        System.out.print("Masukkan merk sepatu: ");
                        String merk = scanner.nextLine();
                        System.out.print("Masukkan warna sepatu: ");
                        String warna = scanner.nextLine();
                        System.out.print("Masukkan ukuran sepatu: ");
                        int ukuran = scanner.nextInt();
                        scanner.nextLine();

                        koleksiSepatu.add(new Sepatu(nama, merk, warna, ukuran));
                        System.out.println("Sepatu berhasil ditambahkan!");
                        break;
                    case 2:
                        if (koleksiSepatu.isEmpty()) {
                            System.out.println("Koleksi sepatu masih kosong.");
                        } else {
                            System.out.println("--- Daftar Koleksi Sepatu ---");
                            for (int i = 0; i < koleksiSepatu.size(); i++) {
                                System.out.println((i + 1) + ". " + koleksiSepatu.get(i));
                            }
                        }
                        break;
                    case 3:
                        if (koleksiSepatu.isEmpty()) {
                            System.out.println("Koleksi kosong, tidak ada yang bisa diperbarui.");
                            break;
                        }
                        System.out.print("Masukkan nomor sepatu yang ingin diperbarui: ");
                        int nomorUpdate = scanner.nextInt();
                        scanner.nextLine();
                        if (nomorUpdate > 0 && nomorUpdate <= koleksiSepatu.size()) {
                            System.out.print("Masukkan nama baru: ");
                            String namaBaru = scanner.nextLine();
                            System.out.print("Masukkan merk baru: ");
                            String merkBaru = scanner.nextLine();
                            System.out.print("Masukkan warna baru: ");
                            String warnaBaru = scanner.nextLine();
                            System.out.print("Masukkan ukuran baru: ");
                            int ukuranBaru = scanner.nextInt();
                            scanner.nextLine();

                            koleksiSepatu.set(nomorUpdate - 1, new Sepatu(namaBaru, merkBaru, warnaBaru, ukuranBaru));
                            System.out.println("Sepatu berhasil diperbarui!");
                        } else {
                            System.out.println("Nomor sepatu tidak valid.");
                        }
                        break;
                    case 4:
                        if (koleksiSepatu.isEmpty()) {
                            System.out.println("Koleksi kosong, tidak ada yang bisa dihapus.");
                            break;
                        }
                        System.out.print("Masukkan nomor sepatu yang ingin dihapus: ");
                        int nomorHapus = scanner.nextInt();
                        scanner.nextLine();
                        if (nomorHapus > 0 && nomorHapus <= koleksiSepatu.size()) {
                            koleksiSepatu.remove(nomorHapus - 1);
                            System.out.println("Sepatu berhasil dihapus.");
                        } else {
                            System.out.println("Nomor sepatu tidak valid.");
                        }
                        break;
                    case 5:
                        System.out.println("Terima kasih, program selesai.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Input tidak valid. Harap masukkan angka untuk pilihan menu dan ukuran.");
                scanner.nextLine(); // Membersihkan input yang salah
                pilihan = 0; // Mengatur pilihan agar perulangan terus berjalan
            }

            System.out.println();
        } while (pilihan != 5);

        scanner.close();
    }
}
        