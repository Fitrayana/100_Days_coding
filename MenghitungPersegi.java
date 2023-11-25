import java.util.Scanner;

public class fitra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi persegi: ");
        double sisi = scanner.nextDouble();

        double luas = sisi * sisi;
        double keliling = 4 * sisi;

        System.out.println("Luas: " + luas + "\nKeliling: " + keliling);

   }
}
