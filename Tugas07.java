import java.util.Scanner;

public class Tugas07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] survey = new int[10][6];
        int jumlahResponden = 0;

        System.out.println("Input Nilai Survei (1-5)");

        for (int i = 0; i < 10; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < 6; j++) {
                System.out.print("Pertanyaan ke-" + (j + 1) + ": ");
                survey[i][j] = sc.nextInt();
                while (survey[i][j] < 1 || survey[i][j] > 5) {
                    System.out.print(" Nilai harus 1-5, ulangi: " );
                    survey[i][j] = sc.nextInt();
                }
            }

            jumlahResponden++;

            System.out.print("Lanjut ke responden berikutnya? (Y/T): ");
            char lanjut = sc.next().toUpperCase().charAt(0);
            if (lanjut == 'T') {
                break;
            }
        }

        System.out.println("\nRata-Rata Tiap Responden");
        for (int i = 0; i < jumlahResponden; i++) {
            int total = 0;
            for (int j = 0; j < 6; j++) {
                total += survey[i][j];
            }
            double rata = (double) total / 6;
            System.out.println("Responden ke-" + (i + 1) + " : " + String.format("%.2f", rata));
        }

        System.out.println("\nRata-Rata Tiap Pertanyaan");
        for (int j = 0; j < 6; j++) {
            int total = 0;
            for (int i = 0; i < jumlahResponden; i++) {
                total += survey[i][j];
            }
            double rata = (double) total / jumlahResponden;
            System.out.println("Pertanyaan ke-" + (j + 1) + " : " + String.format("%.2f", rata));
        }

        int totalSemua = 0;
        int count = 0;
        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < 6; j++) {
                totalSemua += survey[i][j];
                count++;
            }
        }
        double rataKeseluruhan = (double) totalSemua / count;
        System.out.println("\nRata-Rata Keseluruhan");
        System.out.println("Nilai rata-rata keseluruhan: " + String.format("%.2f", rataKeseluruhan));

        sc.close();
    }
}
