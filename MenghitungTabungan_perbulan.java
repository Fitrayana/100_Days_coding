import java.util.Scanner;

public class fitra {

    public static void main(String[] args) {
        // Deklarasi variabel
        int gajiPokok;
        int uangKost;
        int uangTabungan;
        int hargaKomputer;
        int bulanMenabung;

        // Input data
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan gaji pokok: ");
        gajiPokok = input.nextInt();
        System.out.print("Masukkan uang kost: ");
        uangKost = input.nextInt();
        System.out.print("Masukkan harga komputer: ");
        hargaKomputer = input.nextInt();

        // Hitung uang tabungan perbulan
        uangTabungan = gajiPokok - uangKost;

        // Hitung bulan menabung
        bulanMenabung = hargaKomputer / uangTabungan;

        // Tampilkan hasil
        System.out.println("Minimal bulan menabung: " + bulanMenabung);
    }
}
