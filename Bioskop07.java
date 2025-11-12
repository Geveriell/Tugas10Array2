public class Bioskop07 {
    public static void main(String[] args) {

        // Deklarasi array
        String[][] penonton = new String[4][2];

        // Inisialisasi data penonton
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";

        // array for loop
        for (int i = 0; i < penonton.length; i++) {
            for (int j = 0; j < penonton[i].length; j++) {
                System.out.print(penonton[i][j] + "\t");
            }
            System.out.println();
        }

        // Menampilkan panjang array
        System.out.println("\nJumlah baris: " + penonton.length);
        System.out.println("Jumlah kolom baris ke-0: " + penonton[0].length);
        System.out.println("Jumlah kolom baris ke-1: " + penonton[1].length);
        System.out.println("Jumlah kolom baris ke-2: " + penonton[2].length);
        System.out.println("Jumlah kolom baris ke-3: " + penonton[3].length);
    }
}
