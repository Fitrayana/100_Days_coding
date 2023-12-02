public class fitra{
    public static void main(String[] args) {
        int tinggi = 5;

        for (int i = 1; i <= tinggi; i++) {
            // Membuat spasi di sebelah kiri
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }

            // Membuat bintang di baris i
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Pindah ke baris berikutnya
            System.out.println();
        }
    }
}

