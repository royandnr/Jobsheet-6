import java.util.Scanner;                                                    // import library

public class StatusKelulusanPerMataKuliah {          // bagian class
    public static void main(String[] args) {            // Method Main
        Scanner sc = new Scanner(System.in);            // perintah atau statement

        // deklarai variabel
    
        double nilaiAkhir;
        

        // input data mahasiswa
        System.out.println("===== INPUT DATA MAHASISWA ====="); 
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("NIM : ");
        String nim = sc.nextLine();

        // input nilai matkul 1 : algoritma dan pemrograman
        System.out.println(" \n ----- Mata Kuliah 1: Algoritma dan Pemrograman ----- "); // fungsi \n membuat line (baris baru)
        System.out.print("Nilai UTS : ");
        int utsM1 = sc.nextInt();
        System.out.print("Nilai UAS : ");
        int uasM1 = sc.nextInt();
        System.out.print("Nilai Tugas : ");
        int tugasM1 = sc.nextInt();

        // menghitung nilai akhir matkul 1
        nilaiAkhir =(0.3 * utsM1) + (0.4 * uasM1) + (0.3 * tugasM1);

        // struktur pemilihan untuk mengonversi dan mengkualifikasi nilai matkul
        String nilaiHuruf;
        String kualifikasi;

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        } else {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        }

    }
    
}
