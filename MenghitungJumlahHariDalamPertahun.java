
public class fitra {
    public static void main(String[] args) {
        int tahun = 2023;

        int jumlahHari = hitungJumlahHari(tahun);

        System.out.println("Jumlah hari dalam tahun " + tahun + " adalah: " + jumlahHari + " hari.");
    }

    public static int hitungJumlahHari(int tahun) {
        int jumlahHari = (tahun % 4 == 0 && (tahun % 100 != 0 || tahun % 400 == 0)) ? 366 : 365;

        return jumlahHari;
    }
}
