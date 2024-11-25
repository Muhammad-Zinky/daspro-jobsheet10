import java.util.Scanner;

public class Survei10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] data = new int[10][6];

        for (int i = 0; i < 10; i++) {
            System.out.println("Responden " + (i + 1) + ":");
            for (int j = 0; j < 6; j++) {
                System.out.print("Jawaban untuk pertanyaan " + (j + 1) + " (1-5): ");
                data[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nRata-rata untuk setiap responden:");
        for (int i = 0; i < 10; i++) {
            int total = 0;
            for (int j = 0; j < 6; j++) {
                total += data[i][j]; 
            }
            double average = total / 6.0; 
            System.out.println("Rata-rata Responden " + (i + 1) + ": " + average);}

        System.out.println("\nRata-rata untuk setiap pertanyaan:");
        for (int j = 0; j < 6; j++) {
            int total = 0;
            for (int i = 0; i < 10; i++) {
                total += data[i][j];
            }
            double average = total / 10.0;
            System.out.println("Rata-rata Pertanyaan " + (j + 1) + ": " + average); 
        }
        int grandTotal = 0; 
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                grandTotal += data[i][j];             }
        }
        double overallAverage = grandTotal / 60.0; 
        System.out.println("\nRata-rata keseluruhan: " + overallAverage); 
    }
}