import java.util.Scanner;

public class HitungLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = input.nextDouble();

        double luas = Math.PI * jariJari * jariJari;
        double keliling = 2 * Math.PI * jariJari;

        System.out.printf("Luas: %.2f%n", luas);
        System.out.printf("Keliling: %.2f%n", keliling);

        input.close();
    }
}
