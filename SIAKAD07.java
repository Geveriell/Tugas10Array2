import java.util.Scanner;

public class SIAKAD07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc.nextInt();

        int[][] nilai = new int[jumlahMahasiswa][jumlahMatkul];
        double[] rataRata = new double[jumlahMahasiswa];
        double totalSemua = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nInput nilai mahasiswa ke-" + (i + 1));

            int total = 0;
            int max = 0;
            int min = 100;

            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print("Nilai mata kuliah ke-" + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                total += nilai[i][j];

                if (nilai[i][j] > max) {
                    max = nilai[i][j];
                }
                if (nilai[i][j] < min) {
                    min = nilai[i][j];
                }
            }

            rataRata[i] = (double) total / jumlahMatkul;
            totalSemua += rataRata[i];

            System.out.println("Nilai tertinggi: " + max);
            System.out.println("Nilai terendah : " + min);
            System.out.println("Rata-rata      : " + rataRata[i]);
        }

        System.out.println("\n Daftar Nilai Mahasiswa ");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Mahasiswa ke-" + (i + 1) + ": ");
            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print(nilai[i][j] + "\t");
            }
            System.out.println("Rata-rata: " + rataRata[i]);
        }

        double rataKeseluruhan = totalSemua / jumlahMahasiswa;
        System.out.println("\nRata-rata nilai seluruh mahasiswa: " + rataKeseluruhan);

        sc.close();
    }
}
