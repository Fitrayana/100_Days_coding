import java.util.HashMap;
public class fitra {
    public static void main(String[] args) {
        HashMap<String, Integer> nama = new HashMap<>();
        nama.put("Vladimir", 26);
        nama.put("Simajang", 17);
        nama.put("Kodir Si Agen", 89);
        nama.put("Mila Sang petir", 12);

        int usia = nama.get("Kodir Si Agen"); 
        System.out.println("Usia Dari Agen Mata Mata Kodir Adalah: "+usia);
    }
}
