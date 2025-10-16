import java.util.Scanner;                       // import library

public class StatusKelulusanSemester   {   // bagian class

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
        double nilaiAkhirMatkul1 = (uts1 * 0.3) + (uas1 * 0.4)+ (tugas1 * 0.3) / 3.0 ;
        double nilaiAkhirMatkul2 = (uts2 * 0.3) + (uas2 * 0.4)+ (tugas2 * 0.3) / 3.0 ;

        // konversi nilai ke huruf menggunakan if else
        String huruf1, huruf2;

        // Mata kuliah 1
        if (nilaiAkhirMatkul1 > 80 && nilaiAkhirMatkul1 <= 100) {
            huruf1 = "A";
        } else if (nilaiAkhirMatkul1 > 73 && nilaiAkhirMatkul1 <= 80) {
            huruf1 = "B+";
        } else if (nilaiAkhirMatkul1 > 65 && nilaiAkhirMatkul1 <= 73) {
            huruf1 = "B";
        } else if (nilaiAkhirMatkul1 > 60 && nilaiAkhirMatkul1 <= 65) {
            huruf1 = "C+";
        } else if (nilaiAkhirMatkul1 > 50 && nilaiAkhirMatkul1 <= 60) {
            huruf1 = "C";
        } else if (nilaiAkhirMatkul1 > 39 && nilaiAkhirMatkul1 <= 50) {
            huruf1 = "D";
        } else {
            huruf1 = "E";
        }

        // Mata kuliah 2
        if (nilaiAkhirMatkul2 > 80 && nilaiAkhirMatkul2 <= 100) {
            huruf2 = "A";
        } else if (nilaiAkhirMatkul2 > 73 && nilaiAkhirMatkul2 <= 80) {
            huruf2 = "B+";
        } else if (nilaiAkhirMatkul2 > 65 && nilaiAkhirMatkul2 <= 73) {
            huruf2 = "B";
        } else if (nilaiAkhirMatkul2 > 60 && nilaiAkhirMatkul2 <= 65) {
            huruf2 = "C+";
        } else if (nilaiAkhirMatkul2 > 50 && nilaiAkhirMatkul2 <= 60) {
            huruf2 = "C";
        } else if (nilaiAkhirMatkul2 > 39 && nilaiAkhirMatkul2 <= 50) {
            huruf2 = "D";
        } else {
            huruf2 = "E";
        }

        // menentukan status lulus setiap matkul
        String status1;
        if (nilaiAkhirMatkul1 >= 70) {
            status1 = "LULUS";                  // memeriksa apakah nilai akhir atau rata" dari matkul 1 lebih dari ">=" 60 klo lebih maka akan dinyatakan "lulus" dan apabila tidak maka "tidak lulus"
        } else {
            status1 = "TIDAK LULUS";
        }

        String status2;
        if (nilaiAkhirMatkul2 >= 70) {
            status2 = "LULUS";                  // memeriksa apakah nilai akhir atau rata" dari matkul 2 lebih dari ">=" 60 klo lebih maka akan dinyatakan "lulus" dan apabila tidak maka "tidak lulus"
        } else {
            status2 = "TIDAK LULUS";
        }

        // hitung rata rata nilai akhir dari 2 matkul
        double rataRata = (nilaiAkhirMatkul1 + nilaiAkhirMatkul2) / 2.0; // yang dihitung nilai rata rata dari tiap matkul
        
 
        // status semester nested if dengan or
        String statusSemester;
        if (status1.equalsIgnoreCase("TIDAK LULUS") || status2.equalsIgnoreCase("TIDAK LULUS")) {
            statusSemester = "TIDAK LULUS";
            } else {
            if (rataRata >= 70) {
                statusSemester = "LULUS";
            } else {
                statusSemester = "TIDAK LULUS (Rata-rata < 70)";
            }
        }





    }
    }
