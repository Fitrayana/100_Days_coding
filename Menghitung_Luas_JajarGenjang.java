import java.util.Scanner;

public class LuasJajarGenjang {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner input = new Scanner(System.in);

        //Memasukkan panjang dan lebar jajar genjang
        System.out.print("Masukkan panjang jajar genjang: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar jajar genjang: ");
        double lebar = input.nextDouble();

        // Menghitung luas jajar genjang
        double luas = panjang * lebar;

        // Menampilkan hasil
        System.out.println("Luas jajar genjang dengan panjang " + panjang + " dan lebar " + lebar + " adalah " + luas + " satuan luas.");

        input.close();
    }
}
