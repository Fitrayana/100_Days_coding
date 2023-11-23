
import java.util.Scanner;

public class fitra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang diagonal 1: ");
        double diagonal1 = scanner.nextDouble();

        System.out.print("Masukkan panjang diagonal 2: ");
        double diagonal2 = scanner.nextDouble();

        double luas = (diagonal1 * diagonal2) / 2;

        System.out.println("Luas belah ketupat adalah: " + luas);

        scanner.close();
    }
}
