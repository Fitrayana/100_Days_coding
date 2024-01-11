import java.util.Scanner;

public class fitra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tinggi ketupat (ganjil): ");
        int tinggi = scanner.nextInt();

        if (tinggi % 2 == 0) {
            System.out.println("Tinggi harus ganjil.");
            return;
        }

        int setengahTinggi = tinggi / 2;

        // Bagian atas ketupat
        for (int i = 0; i < setengahTinggi; i++) {
            for (int j = 0; j < setengahTinggi - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Bagian bawah ketupat
        for (int i = setengahTinggi; i >= 0; i--) {
            for (int j = 0; j < setengahTinggi - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}

