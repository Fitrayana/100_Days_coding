
import java.util.Scanner;

public class HitungLuasTrapesium {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan panjang sisi atas trapesium: ");
        double sisiAtas = input.nextDouble();
        
        System.out.print("Masukkan panjang sisi bawah trapesium: ");
        double sisiBawah = input.nextDouble();
        
        System.out.print("Masukkan tinggi trapesium: ");
        double tinggi = input.nextDouble();
        
        double luasTrapesium = 0.5 * (sisiAtas + sisiBawah) * tinggi;
        
        System.out.println("Luas trapesium adalah: " + luasTrapesium);
    }
}
