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

        // Menampilkan penonton baris ke-3 dengan foreach
        System.out.println("\nPenonton baris ke-3 (foreach):");
        for (String nama : penonton[2]) {
            System.out.println(nama);
        }
    }
}
