
public class fitra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input panjang balok
        System.out.print("Masukkan panjang balok: ");
        double panjang = scanner.nextDouble();

        // Input lebar balok
        System.out.print("Masukkan lebar balok: ");
        double lebar = scanner.nextDouble();

        // Input tinggi balok
        System.out.print("Masukkan tinggi balok: ");
        double tinggi = scanner.nextDouble();

        // Menghitung volume balok
        double volume = panjang * lebar * tinggi;

        System.out.println("Volume balok adalah: " + volume);
    }
}
