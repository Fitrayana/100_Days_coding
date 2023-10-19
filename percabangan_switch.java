public class Percabangan_switch {
    public static void main(String[] args) {
        int angka = 100; //Ini adalah inisialisasi variabel angka dengan nilai 100. Variabel ini akan digunakan dalam pernyataan switch untuk menentukan jalannya eksekusi program
    switch (angka) { //pernyataan ini digunakan untuk memilih salah satu dari beberapa opsi berdasarkan nilai yang diberikan pada ekspresi di dalam tanda kurung. 
        case 50: //Ini adalah label case pertama dimana dia akan memeriksa apakah nilai pilihan sama dengan 50 dan jika benar, maka kode di dalam blok case 50 akan dieksekusi.
            System.out.println("Kamu Memilih angka pertama Yaitu 50"); //yang digunakan untuk mencetak teks ke konsol. Jika nilai pilihan sama dengan 50, aka pesan "Kamu Memilih angka pertama Yaitu 50" akan dicetak.
            break; //pernyataan yang digunakan untuk menghentikan eksekusi dari switch setelah blok case yang sesuai dieksekusi.
        case 100: // peryataan Ini memeriksa apakah nilai pilihan sama dengan 100. Jika benar, maka kode di dalam blok case 100 akan dieksekusi.
            System.out.println("Kamu Memilih Pilihan Kedua Yaitu 100"); //pernyataan  yang mencetak pesan "Kamu Memilih angka Kedua Yaitu 100" jika nilai pilihan sama dengan 100.
            break; //pernyataan yang digunakan untuk menghentikan eksekusi dari switch.
        default: //jika nilai angka tidak cocok dengan salah satu label case sebelumnya, maka kode dalam blok default akan dieksekusi.
            System.out.println("Tidak Ada yang terpilih"); //pernyataan  yang mencetak pesan "Tidak Ada angka yang terpilih" jika tidak ada kesesuaian dengan label case sebelumnya.
        }
    }
}
