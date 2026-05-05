/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pboMahasiswa;

/**
 *
 * @author Nahrul Mubarok
 * NIM :25104410062
 * KELAS : 2B
 * PRODI : Teknik Informatika
 */
public class Mahasiswa {
//    atribut private
private String nim;
private String nama;
private String jurusan;
private int semester;
private double ipk;

//constructor tanpa parameter
public Mahasiswa(){}

//constructor dengan parameter Nim dan Nama

public Mahasiswa (String nim, String nama) {
    this.nim = nim;
    this.nama = nama;
}

//constructor dengan semua parameter

public Mahasiswa (String nim, String nama, String jurusan, int semester, double ipk) {
    this.nim = nim;
    this.nama = nama;
    this.jurusan = jurusan;
    this.semester = semester;
    this.ipk = ipk;
}
//Getter and Setter
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }
public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    } 
    public int getSemester() {
        return semester;
    }
//validasi semester (1-8)
    public void setSemester(int semester) {
       if (semester >= 1 && semester <= 8){ 
        this.semester = semester;
       }else {
            System.out.println("Semester harus Antara 1-8");
        } 
    }

    public double getIpk() {
        return ipk;
    }
//validasi ipk
    public void setIpk(double ipk) {
        if (ipk >= 0.0 && ipk <= 4.0) this.ipk = ipk;
        else System.out.println("IPK harus 0.0-4.0");
    }
//        method tanpa parameter
    
public void tampilData(){
    System.out.println("NIM: " + nim);
    System.out.println("NAMA: " + nama);
    System.out.println("JURUSAN: " + jurusan);
    System.out.println("SEMESTER: " + semester);
    System.out.println("IPK: " + ipk);
     System.out.println("STATUS : " + (isLulus() ? "Lulus" : "Belum Lulus"));
}
    // Method dengan parameter boolean (overloading)
public void tampilData(boolean header){
    if (header){
        System.out.println("==== Data Mahasiswa ===");
    }
    tampilData(); //memanggil method tanpa parameter
}
//method tambahan
//mengecek kelulusan (ipk >= 3.0)
public boolean isLulus(){
    return ipk >= 3.0;
}
//membatasi semseter maksimal 8
public void naikSemester(){
    if (semester <8) {
    semester++;
 System.out.println("Semester " + nama + " Naik Menjadi " + semester);
    } else {
        System.out.println("Mahasiswa " + nama + " Sudah Semester 8, Tidak Bisa Naik Lagi.");
    }
}
}