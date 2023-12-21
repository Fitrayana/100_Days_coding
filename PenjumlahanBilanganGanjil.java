import java.util.Scanner;

public class fitra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nilai pertama: ");
        int nilai1 = sc.nextInt();
        int k = 0;
        for (int n = 0; n < nilai1; n++) {
            if (n % 2 == 1) {
                k += n;
            }
        }
        System.out.println("jumlah seluru dibawa variabel inputan: " + k);
    }
}
