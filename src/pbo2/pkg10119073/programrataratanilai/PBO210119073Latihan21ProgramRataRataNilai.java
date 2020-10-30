package pbo2.pkg10119073.latihan21.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menghitung rata-rata
 * nilai
 *
 */

public class PBO210119073Latihan21ProgramRataRataNilai {
    public static void main(String[] args) {
        int banyakmhs;
        int nilaimhs;
        double totnilai;
        double ratanilai;
        
        System.out.print("Masukkan Banyaknya Mahasiswa: ");
        Scanner scanner = new Scanner(System.in);
        banyakmhs = scanner.nextInt();
        totnilai = 0;
        
        for (int i = 1; i <= banyakmhs; i++){
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilaimhs = scanner.nextInt();
            totnilai += nilaimhs;
        }
        ratanilai = totnilai / banyakmhs;
        
        System.out.println("");
        System.out.println("Maka, Rata-rata Nilainya adalah " + ratanilai);
        System.out.println("Developed by : Aghnia Dewi Mahiranie");
    }
    
}