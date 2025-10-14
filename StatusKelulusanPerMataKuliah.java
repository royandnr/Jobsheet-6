import java.util.Scanner;                       // import library

public class StatusKelulusanPerMataKuliah   {   // bagian class

    public static void main(String[] args) {    // Method Main
        Scanner sc = new Scanner(System.in);    // perintah atau statement

        // input data mahasiswa
        System.out.println("===== INPUT DATA MAHASISWA ====="); 
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("NIM : ");
        String nim = sc.nextLine();

        // matkul pertama algoritma dan pemrograman
        System.out.println(" \n ----- Mata Kuliah 1: Algoritma dan Pemrograman ----- "); // fungsi \n membuat line (baris baru)
        System.out.print("Nilai UTS : ");
        int uts1 = sc.nextInt();
        System.out.print("Nilai UAS : ");
        int uas1 = sc.nextInt();
        System.out.print("Nilai Tugas : ");
        int tugas1 = sc.nextInt();

        // matkul kedua struktur data
        System.out.println("\n ----- Mata Kuliah 2: Struktur Data ----- "); // fungsi \n membuat line (baris baru)
        System.out.print("Nilai UTS : ");
        int uts2 = sc.nextInt();
        System.out.print("Nilai UAS : ");
        int uas2 = sc.nextInt();
        System.out.print("Nilai Tugas : ");
        int tugas2 = sc.nextInt();

        // hitung nilai akhir (rata rata dari 3 nilai)
        double nilaiAkhirMatkul1 = (uts1 + uas1 + tugas1) / 3.0 ;
        double nilaiAkhirMatkul2 = (uts2 + uas2 + tugas2) / 3.0 ;

        // menentukan status lulus setiap matkul
        String status1;
        if (nilaiAkhirMatkul1 >= 60) {
            status1 = "LULUS";                  // memeriksa apakah nilai akhir atau rata" dari matkul 1 lebih dari ">=" 60 klo lebih maka akan dinyatakan "lulus" dan apabila tidak maka "tidak lulus"
        } else {
            status1 = "TIDAK LULUS";
        }

        String status2;
        if (nilaiAkhirMatkul2 >= 60) {
            status2 = "LULUS";                  // memeriksa apakah nilai akhir atau rata" dari matkul 2 lebih dari ">=" 60 klo lebih maka akan dinyatakan "lulus" dan apabila tidak maka "tidak lulus"
        } else {
            status2 = "TIDAK LULUS";
        }

        









    }
}