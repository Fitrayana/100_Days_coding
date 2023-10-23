package fitrayana;

import java.util.Scanner;

public class Day14_Mengkonversi_Nilai_Interval_Ke_Nilai_Huruf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nilai = sc.nextInt();
        if (nilai >= 80){
            System.out.println("A");
        } else if (nilai >= 60) {
            System.out.println("B");
        } else if (nilai >= 40) {
            System.out.println("C");
        } else {
            System.out.println("E");
        }
        
    }
    
}
