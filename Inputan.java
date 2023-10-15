import java.util.Scanner;

public class Inputan_rumus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan alas:");
        int a = sc.nextInt();
        System.out.print("Masukkan tinggi:");
        int t = sc.nextInt();
        int rumus = a*t*1/2;
        
        System.out.print("Luas:"+rumus+"cm");
        
        
    }
}
