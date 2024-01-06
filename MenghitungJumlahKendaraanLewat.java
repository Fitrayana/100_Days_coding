
import java.util.Scanner;

public class fitra{

    private static String jumlahKendaraan;

    public static void main(String[] args) {
        System.out.println("Jumlah kendaraan yang lewat: " + jumlahKendaraan);
        Scanner scanner = new Scanner(System.in);

        int jumlahKendaraan = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.print("Apakah ada kendaraan yang lewat? (ya/tidak): ");
            String jawaban = scanner.nextLine();

            if (jawaban.equalsIgnoreCase("ya")) {
                jumlahKendaraan++;
            } else if (jawaban.equalsIgnoreCase("tidak")) {
                System.out.println("Tidak ada kendaraan yang lewat.");
            } else {
                System.out.println("Input tidak valid. Harap masukkan 'ya' atau 'tidak'.");
                i--;
            }
        }

        hitungKendaraan(jumlahKendaraan);

    }

    private static void hitungKendaraan(int jumlahKendaraan) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
