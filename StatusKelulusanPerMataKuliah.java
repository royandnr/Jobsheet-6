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

        // matkul pertama 
        System.out.println(" \n ----- Mata Kuliah 1: Algoritma dan Pemrograman ----- "); // fungsi \n membuat line (baris baru)
        System.out.print("Nilai UTS : ");
        int uts1 = sc.nextInt();
        System.out.print("Nilai UAS : ");
        int uas1 = sc.nextInt();
        System.out.print("Nilai Tugas : ");
        int tugas1 = sc.nextInt();

        





    }
}