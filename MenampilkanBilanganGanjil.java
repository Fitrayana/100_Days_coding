public class fitra {
    public static void main(String[] args) {
        int angka = 50;

        System.out.println("Bilangan Ganjil " + angka + " adalah:");
        
        for (int i = 1; i <= angka; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

