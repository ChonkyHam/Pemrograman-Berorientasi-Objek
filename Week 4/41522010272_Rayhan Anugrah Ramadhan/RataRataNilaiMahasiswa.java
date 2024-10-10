import java.util.InputMismatchException;
import java.util.Scanner;

public class RataRataNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data mahasiswa
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = input.nextInt();
        
        String[] mataKuliah = new String[jumlahMataKuliah];
        double[] nilai = new double[jumlahMataKuliah];

        // Input nilai untuk setiap mata kuliah
        for (int i = 0; i < jumlahMataKuliah; i++) {
            input.nextLine(); // Membersihkan buffer
            System.out.print("Masukkan nama mata kuliah " + (i + 1) + ": ");
            mataKuliah[i] = input.nextLine();
            
            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Masukkan nilai untuk " + mataKuliah[i] + ": ");
                    nilai[i] = input.nextDouble();
                    validInput = true; // input berhasil
                } catch (InputMismatchException e) {
                    System.out.println("Input tidak valid. Masukkan nilai berupa angka.");
                    input.next(); // Membersihkan input yang salah
                }
            }
        }

        // Menghitung rata-rata nilai
        double totalNilai = 0;
        for (int i = 0; i < jumlahMataKuliah; i++) {
            totalNilai += nilai[i];
        }
        double rataRata = totalNilai / jumlahMataKuliah;

        // Menampilkan hasil
        System.out.println("\nNama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Daftar Mata Kuliah dan Nilai:");
        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.println(mataKuliah[i] + ": " + nilai[i]);
        }
        System.out.println("Rata-rata nilai: " + rataRata);
    }
}