import java.util.Scanner;

public class RataRataNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahMataKuliah = 3;

        String[] mataKuliah = new String[jumlahMataKuliah];
        double[] nilai = new double[jumlahMataKuliah];

        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.print("Masukkan nama mata kuliah " + (i + 1) + ": ");
            mataKuliah[i] = scanner.nextLine();
        }

        boolean valid = false;
        while (!valid) {
            try {
                for (int i = 0; i < jumlahMataKuliah; i++) {
                    System.out.print("Masukkan nilai untuk " + mataKuliah[i] + ": ");
                    nilai[i] = scanner.nextDouble();
                    scanner.nextLine();
                }
                valid = true;
            } catch (Exception e) {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                scanner.nextLine(); 
            }
        }

        double total = 0;
        for (double n : nilai) { 
            total += n;
        }
        double rataRata = total / jumlahMataKuliah;

        System.out.printf("Rata-rata nilai mata kuliah: %.2f%n", rataRata);
        System.out.println("Detail nilai mata kuliah: ");

        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.printf("%s: %.2f%n", mataKuliah[i], nilai[i]); 
        }

        scanner.close(); 
    }
}
