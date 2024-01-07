
import java.util.Scanner;

public class fitra {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Masukkan angka: ");

        int bilangan = scanner.nextInt();

        System.out.println("hitungan mundur dari angka " + bilangan + " tersebut adalah");

        for (int i = bilangan; i >= 0; i--) {

            System.out.println(i + " ");

        }

    }
