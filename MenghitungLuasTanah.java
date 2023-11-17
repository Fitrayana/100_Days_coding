

import java.util.Scanner;

public class HitungLuasTanah {
    public static void main(String[] args) {
        // disini kita menggunakan objek Scanner untuk input dari user/pengguna
        Scanner scanner = new Scanner(System.in);

        // input panjang dan lebar tanah
        System.out.print("Masukkan panjang tanah (meter): ");
        double panjang = scanner.nextDouble();

        System.out.print("Masukkan lebar tanah (meter): ");
        double lebar = scanner.nextDouble();

        // menghitung luas tanah dengan rumus dibawah
        double luas = panjang * lebar;
      
        System.out.println("Luas tanah adalah: " + luas + " meter persegi");

        scanner.close();
    }
}
