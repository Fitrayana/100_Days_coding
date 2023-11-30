import java.util.Scanner;

public class fitra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi segi enam: ");
        double sisi = scanner.nextDouble();

        double luas = (3 * Math.sqrt(3) * Math.pow(sisi, 2)) / 2;
        double keliling = 6 * sisi;

        System.out.println("Luas segi enam: " + luas);
        System.out.println("Keliling segi enam: " + keliling);

       
    }
}

