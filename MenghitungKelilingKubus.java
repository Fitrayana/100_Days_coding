
import java.util.Scanner;

public class fitra {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Panjang Sisi Kubus: ");
        double sisi = sc.nextDouble();
        double keliling = 12 * sisi;
        
        System.out.println("Keliling Kubus Adalah: " + keliling);
        
        sc.close();
    }
    
}
