import java.util.Scanner;

public class fitra{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari bola: ");
        double jariJari = scanner.nextDouble();

        // Menghitung keliling bola menggunakan rumus K = 2 * pi * r
        double keliling = 2 * Math.PI * jariJari;

        // Menampilkan hasil keliling bola
        System.out.println("Keliling bola adalah: " + keliling);
    }
}

