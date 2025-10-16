import java.util.Scanner;                                                    // import library

public class StatusKelulusanPerMataKuliah {          // bagian class
    public static void main(String[] args) {            // Method Main
        Scanner sc = new Scanner(System.in);            // perintah atau statement

        // deklarai variabel
        double nilaiAkhir;
        double nilaiAkhir2;

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

        // input nilai matkul 2 : struktur data
        System.out.println(" \n ----- Mata Kuliah 2: Struktur Data ----- "); // fungsi \n membuat line (baris baru)
        System.out.print("Nilai UTS : ");
        int utsM2 = sc.nextInt();
        System.out.print("Nilai UAS : ");
        int uasM2 = sc.nextInt();
        System.out.print("Nilai Tugas : ");
        int tugasM2 = sc.nextInt();

        // menghitung nilai akhir matkul 1
        nilaiAkhir =(0.3 * utsM1) + (0.4 * uasM1) + (0.3 * tugasM1);  
        nilaiAkhir2 =(0.3 * utsM2) + (0.4 * uasM2) + (0.3 * tugasM2);

        // struktur pemilihan untuk mengonversi dan mengkualifikasi nilai matkul 1
        String nilaiHuruf;
        String kualifikasi;

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {     // jika nilai akhir lebih dari 80 dan kurang dari sama dengan 100 maka nilai hurufnya "A" dan kualifikasinya "Sangat Baik"
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


        // struktur pemilihan untuk mengonversi dan mengkualifikasi nilai matkul 2
        String nilaiHuruf2;
        String kualifikasi2;

        if (nilaiAkhir2 > 80 && nilaiAkhir2 <= 100) {
            nilaiHuruf2 = "A";
            kualifikasi2 = "Sangat Baik";
        } else if (nilaiAkhir2 > 73 && nilaiAkhir2 <= 80) {
            nilaiHuruf2 = "B+";
            kualifikasi2 = "Lebih dari Baik";
        } else if (nilaiAkhir2 > 65 && nilaiAkhir2 <= 73) {
            nilaiHuruf2 = "B";
            kualifikasi2 = "Baik";
        } else if (nilaiAkhir2 > 60 && nilaiAkhir2 <= 65) {
            nilaiHuruf2 = "C+";
            kualifikasi2 = "Lebih dari Cukup";
        } else if (nilaiAkhir2 > 50 && nilaiAkhir2 <= 60) {
            nilaiHuruf2 = "C";
            kualifikasi2 = "Cukup";
        } else if (nilaiAkhir2 > 39 && nilaiAkhir2 <= 50) {
            nilaiHuruf2 = "D";
            kualifikasi2 = "Kurang";
        } else {
            nilaiHuruf2 = "E";
            kualifikasi2 = "Gagal";
        }

        // menampilkan hasil nilai akhir matkul pertama
        System.out.println(" \n ----- Keterangan Lulus atau Tidak Lulus Mata Kuliah 1: Algoritma dan Pemrograman ----- ");
        System.out.println("\nNilai Akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + nilaiHuruf);
        System.out.println("Kualifikasi : " + kualifikasi);
        if (nilaiAkhir >= 60)
            System.out.println("Status : LULUS");
        else
            System.out.println("Status : TIDAK LULUS");

        // menampilkan hasil nilai akhir matkul kedua 
        System.out.println(" \n ----- Keterangan Lulus atau Tidak Lulus Mata Kuliah 2: Struktur Data ----- ");
        System.out.println("\nNilai Akhir : " + nilaiAkhir2);
        System.out.println("Nilai Huruf : " + nilaiHuruf2);
        System.out.println("Kualifikasi : " + kualifikasi2);
        if (nilaiAkhir2 >= 60)
            System.out.println("Status : LULUS");
        else
            System.out.println("Status : TIDAK LULUS");
    }
    
}
