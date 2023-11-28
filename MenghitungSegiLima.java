
import java.util.Scanner;

public class fitra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tinggi segi lima: ");
        int tinggi = scanner.nextInt();

        for (int i = -tinggi + 1; i < tinggi; i++)
            System.out.println(" ".repeat(tinggi - Math.abs(i) - 1) + "*".repeat(2 * Math.abs(i) + 1));

       
    }
}
