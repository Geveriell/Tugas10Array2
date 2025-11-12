import java.util.Scanner;

public class SIAKAD07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] nilai = new int[5][3];
        double[] rataRata = new double[5];
        double totalSemua = 0;


        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));

            int total = 0;
            int max = 0;
            int min = 100;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai ke-" + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                total += nilai[i][j];

                if (nilai[i][j] > max) {
                    max = nilai[i][j];
                }
                if (nilai[i][j] < min) {
                    min = nilai[i][j];
                }
            }

            rataRata[i] = (double) total / nilai[i].length;
            totalSemua += rataRata[i];

            System.out.println("Nilai tertinggi: " + max);
            System.out.println("Nilai terendah : " + min);
            System.out.println("Rata-rata      : " + rataRata[i]);
            System.out.println();
        }

        System.out.println("\n Daftar Nilai Mahasiswa ");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Mahasiswa ke-" + (i + 1) + ": ");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(nilai[i][j] + "\t");
            }
            System.out.println("Rata-rata: " + rataRata[i]);
        }

        double rataKeseluruhan = totalSemua / nilai.length;
        System.out.println("\nRata-rata nilai seluruh mahasiswa: " + rataKeseluruhan);

        sc.close();
    }
}
