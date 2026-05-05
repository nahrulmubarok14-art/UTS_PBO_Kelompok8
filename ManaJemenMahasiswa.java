/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pboMahasiswa;

import java.util.Scanner;

/**
 *
 * @author Nahrul Mubarok
 * NIM :25104410062
 * KELAS : 2B
 * PRODI : Teknik Informatika
 */
public class ManaJemenMahasiswa {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
//            scanner dengan local US agar input double mengunakan titik (1.5)
            input.useLocale(java.util.Locale.US);
//            array of object
//kapasitas maksimal 10 mahasiswa
            Mahasiswa[] daftarMhs = new Mahasiswa[10];
            int jumlah = 0; //jumlah mahasiswa yang tersimpan
            int pilihan; 
//            menu DO-WHILE
            do {
//                tampilan menu
                System.out.println("\n==== MENU ====");
                System.out.println("1. Tambah Mahasiswa");
                System.out.println("2. Tampilkan Semua");
                System.out.println("3. Cari Mahasiswa");
                System.out.println("4. Tampilkan Lulus");
                System.out.println("5. Naikkan Semester");
                System.out.println("6. Keluar");
                System.out.print("Pilih :");
                
                pilihan = input.nextInt();
                input.nextLine();  //bersihkan newLine
//                SWITCH CASE untuk setiap pilihan
                switch (pilihan) {
                    case 1 -> {
                        
    if (jumlah < 10) { //menambah mahasiswa
        Mahasiswa mhs = new Mahasiswa();
        
        System.out.printf("%-10s: ", "NIM");
        String nim = input.nextLine();
        // Validasi NIM tidak kosong
        if (nim.trim().isEmpty()) {
            System.out.println("NIM tidak boleh kosong!");
            break;
        }
        mhs.setNim(nim);
        
        System.out.printf("%-10s: ", "NAMA");
        mhs.setNama(input.nextLine());
        
        System.out.printf("%-10s: ", "JURUSAN");
        mhs.setJurusan(input.nextLine());
        
        System.out.printf("%-10s: ", "SEMESTER");
        int semester = input.nextInt();
        mhs.setSemester(semester);
        
        System.out.printf("%-10s: ", "IPK");
        double ipk = input.nextDouble();
        mhs.setIpk(ipk);
        
        input.nextLine(); // bersihkan newline setelah nextDouble
        
        daftarMhs[jumlah] = mhs; //simpan ke ARRAY
        jumlah++;
        System.out.println("Data Berhasil Ditambahkan!");
    } else {
        System.out.println("Data Penuh!");
    }
    break;
                    }
                        
                    case 2 -> { //menampilkan mahasiswa yang di input
                        if (jumlah == 0){
                            System.out.println("Belum Ada Data");
                        } else {
                            for (int i = 0; i < jumlah; i++) {
                                daftarMhs[i].tampilData(); //memanggil method tampilData
                            }
                        }
                    }
                        
                        
                    case 3 -> { //mencari mahasiswa berdasarkan NIM
                        System.out.println("Masukan Nim Yang Dicari");
                        String cari = input.nextLine();
                        
                        boolean ketemu = false;
                        
                        for (int i = 0; i < jumlah; i++) {
                            if (daftarMhs[i].getNim().equals(cari)) {
                                daftarMhs[i].tampilData();
                                ketemu = true;
                                break;
                            }
                            
                        }
                        if (!ketemu){
                            System.out.println("Data Tidak Ditemukan");
                        }
                    }
                        
                    case 4 -> { //menampilkan mahasiswa yang lulus (IPK >= 3.0)
                        boolean adaLulus = false;
                        
                        for (int i = 0; i < jumlah; i++) {
                            if (daftarMhs[i].isLulus()){                            
                                daftarMhs[i].tampilData();
                                adaLulus = true;
                            }
                        }
                        if (!adaLulus){
                            System.out.println("Tidak Ada Mahasiswa Yang Lulus");
                        }
                    }
                        
                    case 5 -> { //menaikan semester semua mahasiswa
                        if (jumlah == 0){
                            System.out.println("Belum Ada Data");
                        } else {
                            for (int i = 0; i < jumlah; i++) {
                                daftarMhs[i].naikSemester();
                            }
                            System.out.println("Semua Mahasiswa Naik Semester");
                        }
                    }
                        
                    case 6 -> System.out.println("Terima kasih"); //selesai//program berhenti
                        
                    default -> System.out.println("Pilihan Tidak Valid");
                }
            } while (pilihan != 6); //ulangi selama belum memilih nomer 6
        } //menutup scanner
    }
}
