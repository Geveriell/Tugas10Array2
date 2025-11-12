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

        // Menampilkan semua nama penonton setiap baris
        System.out.println("\nDaftar penonton tiap baris:");
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Baris ke-" + (i + 1) + ": " + String.join(", ", penonton[i]));
        }
    }
}
