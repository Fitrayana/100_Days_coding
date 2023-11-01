import java.util.Scanner;

public class HitungLuasSegitiga {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk masukan dari user
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan panjang dan tinggi segitiga
        System.out.print("Masukkan panjang segitiga: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = input.nextDouble();

        // Hitung luas segitiga
        double luas = 0.5 * panjang * tinggi;

        System.out.println("Luas segitiga adalah: " + luas);

        input.close();
    }
}
