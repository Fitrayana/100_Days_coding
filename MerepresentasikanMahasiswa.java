import java.util.Scanner;

public class ftra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Masukkan nama Mahasiswa: ");
        String namaMahasiswa = scanner.nextLine();
        
        System.out.print("Masukkan nim mahasiswa: ");
        String nimMahasiswa = scanner.nextLine();
        
        System.out.print("Masukkan ipk Mahasiswa: ");
        double ipkMahasiswa = scanner.nextDouble();
        
        System.out.println("Nama mahasiswa: " + namaMahasiswa);
        System.out.println("Nim mahasiswa: " + nimMahasiswa);
        System.out.println("IPK mahasiswa: " + ipkMahasiswa);
    }
}
