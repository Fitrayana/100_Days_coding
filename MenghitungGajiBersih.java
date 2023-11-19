import java.util.Scanner;

public class fitra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan gaji kotor: ");
        double gajiKotor = scanner.nextDouble();

        // Hitungan potongan pajak (misalnya setiap dia menerima gaji dia memiliki pajak 20%)
        double PPajak = 0.2;
        double pajak = gajiKotor * PPajak;

        // Hitung gaji bersih
        double gajiBersih = gajiKotor - pajak;

        // Tampilkan hasil
        System.out.println("Gaji Kotor: " + gajiKotor);
        System.out.println("Pajak: " + pajak);
        System.out.println("Gaji Bersih: " + gajiBersih);
    }
}

