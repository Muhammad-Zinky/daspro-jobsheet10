import java.util.Scanner;

public class SIAKAD10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = scanner.nextInt();

        int [][] nilai = new int[jumlahSiswa][jumlahMatkul];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPersiswa = 0;

            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = scanner.nextInt();
                totalPersiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " + totalPersiswa / jumlahMatkul);
        }

        System.out.println("\n===============================");
        System.out.println("Rata-rata nilai setiap Mata Kuliah");

        for (int j = 0; j < jumlahMatkul; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < jumlahSiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j + 1) + ": " + totalPerMatkul / jumlahSiswa);
        }
    }
}