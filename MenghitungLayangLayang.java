import java.util.Scanner;

public class fitra {
    public static void main(String[] args) {
        // Membuat objek Scanner
        Scanner scanner = new Scanner(System.in);

        // masukkan panjang dan lebar diagonal layang-layang
        System.out.print("Masukkan panjang diagonal 1: ");
        double diagonal1 = scanner.nextDouble();

        System.out.print("Masukkan panjang diagonal 2: ");
        double diagonal2 = scanner.nextDouble();

        // Menghitung luas dan keliling layang-layang
        double luas = 0.5 * diagonal1 * diagonal2;
        double keliling = 2 * (Math.sqrt(Math.pow(diagonal1 / 2, 2) + Math.pow(diagonal2 / 2, 2)));

        // Menampilkan hasil
        System.out.println("Luas layang-layang: " + luas);
        System.out.println("Keliling layang-layang: " + keliling);

      
    }
}

