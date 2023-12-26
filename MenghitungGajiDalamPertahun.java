import java.util.Scanner;

public class fitra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan gaji bulanan: ");
        double gajiBulanan = scanner.nextDouble();
        // Menghitung gaji tahunan
        double gajiTahunan = hitungGajiTahunan(gajiBulanan);

        System.out.printf("Gaji tahunan Anda adalah %.2f%n", gajiTahunan);
    }

    // Metod untuk menghitung gaji tahunan
    public static double hitungGajiTahunan(double gajiBulanan) {
        double gajiTahunan = gajiBulanan * 12;
        return gajiTahunan;
    }
}

