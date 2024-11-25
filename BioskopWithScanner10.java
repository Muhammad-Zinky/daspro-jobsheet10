import java.util.Scanner;

public class BioskopWithScanner10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int baris, kolom; 
        String nama, next;
        int menuChoice;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menuChoice = scanner.nextInt();
            scanner.nextLine();

            switch (menuChoice) {
                case 1:
                    System.out.print("Masukan nama: ");
                    nama = scanner.nextLine();
                    while (true) {
                        System.out.print("Masukan baris (1-4): ");
                        baris = scanner.nextInt();
                        System.out.print("Masukan kolom (1-2): ");
                        kolom = scanner.nextInt();
                        scanner.nextLine();

                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Nomor baris atau kolom tidak tersedia. Silakan coba lagi.");
                        } else if (penonton[baris-1][kolom-1] != null) {
                            System.out.println("Kursi tersebut sudah terisi. Silakan pilih kursi yang lain.");
                        } else {
                            penonton[baris-1][kolom-1] = nama;
                            break; 
                        }
                    }
                    break;
                case 2:
                    System.out.println("Daftar penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            System.out.println("Baris " + (i+1) + " Kolom " + (j+1) + ": " + (penonton[i][j] != null ? penonton[i][j] : "***"));
                        }
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan layanan kami.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

            System.out.print("Kembali ke menu utama? (yes/no): ");
            next = scanner.nextLine();
            if (next.equalsIgnoreCase("no")) {
                break;
            }
        }
    }
}
