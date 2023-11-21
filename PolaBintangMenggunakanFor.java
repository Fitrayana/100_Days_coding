
import java.util.Scanner;

public class fitra {

    public static void main(String[] args) {
        int tinggi = 5;

        for (int i = 1; i <= tinggi; i++) {
            for (int j = tinggi - i; j >= 1; j--) {
                System.out.println(" ");
            }
            for (int k = 1; k <= i * 2; k++) {
                System.out.println("* ");
            }
            System.out.println();
        }
    }
}
