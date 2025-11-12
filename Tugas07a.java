// File: Tugas07a.java
import java.util.Scanner;

public class Tugas07a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] survey = new int[10][6];
        int respondenTerakhir = 0;

        System.out.println("Input nilai survei (1-5):");

        for (int i = 0; i < 10; i++) {
            System.out.println("\nResponden ke-" + (i + 1));
            respondenTerakhir = i + 1;

            for (int j = 0; j < 6; j++) {
                System.out.print("Pertanyaan ke-" + (j + 1) + ": ");
                survey[i][j] = sc.nextInt();
            }

            sc.nextLine(); 
            System.out.print("Apakah ingin lanjut ke responden berikutnya? (y/n): ");
            String pilih = sc.nextLine().trim().toLowerCase();

            if (pilih.equals("n")) {
                System.out.println("\n Input dihentikan oleh pengguna.");
                break;
            }
        }

        System.out.println("\n Input selesai! Berikut data yang sudah dimasukkan:");
        for (int i = 0; i < respondenTerakhir; i++) {
            System.out.print("Responden ke-" + (i + 1) + ": ");
            for (int j = 0; j < 6; j++) {
                System.out.print(survey[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
