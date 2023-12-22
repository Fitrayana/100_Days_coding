import java.util.Scanner;

public class fitra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan umur: ");
        int umur = scanner.nextInt();
         if (umur >= 0 && umur <= 4) {
             System.out.println("Balita"); 
        } else if (umur >= 5 && umur <= 12) {
             System.out.println("Anak-anak");
        } else if (umur >= 13 && umur <= 17) {
             System.out.println("Remaja");
        } else if (umur >= 18 && umur <= 59) {
             System.out.println("Dewasa");
        } else {
             System.out.println("Lansia");
        }
    }
}
