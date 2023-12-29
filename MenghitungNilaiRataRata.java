
import java.util.Scanner;

public class fitra {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan: ");
        int jumlahBilangan = scanner.nextInt();

        double total = 0;

        for (int i = 0; i < jumlahBilangan; i++) {
            System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
            double bilangan = scanner.nextDouble();

            total += bilangan;
        }

        double rataRata = total / jumlahBilangan;

        System.out.println("Rata-rata: " + rataRata);
    }
}
