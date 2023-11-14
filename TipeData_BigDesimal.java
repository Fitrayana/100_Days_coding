
import java.math.BigDecimal;

public class BigDecimal {
    public static void main(String[] args) {
        BigDecimal nilai1 = new BigDecimal("15.20");
        BigDecimal nilai2 = new BigDecimal("10.50");

        // Penjumlahan
        BigDecimal sum = nilai1.add(nilai2);
        System.out.println("Penjumlahan: " + sum);

        // Pengurangan
        BigDecimal difference = nilai1.subtract(nilai2);
        System.out.println("Pengurangan: " + difference);
    }
}
//bigdesimal merupakan tipe data non primitif yang dimana ia digunakan untuk melakukan operasi aritmatika yang membutuhkan presisi tinggi dan untuk menghindari masalah yang mungkin sering terjadi dengan float dan double.
