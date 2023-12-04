import java.util.ArrayList;

public class fitra {

    public static void main(String[] args) {
    
        ArrayList<String> daftarBarang = new ArrayList<>();
        
        daftarBarang.add("buku");
        daftarBarang.add("pulpen");
        daftarBarang.add("mistar");
        daftarBarang.add("kertas hvs");
        daftarBarang.add("daubel tip");
       
        System.out.println("Daftar Barang Sebelum Penghapusan:");
        System.out.println(daftarBarang);

        removeItem(daftarBarang, "mistar");

        System.out.println("Daftar Barang Setelah Penghapusan:");
        System.out.println(daftarBarang);
    }
    private static void removeItem(ArrayList<String> list, String itemToRemove) {

        list.remove(itemToRemove);
        System.out.println("mistar \"" + itemToRemove + "\" berhasil dihapus.");
    }
}
