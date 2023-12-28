public class fitra {

    public static void main(String[] args) {
      
        int jumlahBuah = 500;
        int jumlahBuahBusuk = 0;
        int jumlahBuahBaik = 0;

        for (int i = 0; i < jumlahBuah; i++) {
            // Kondisi buah busuk
            if (Math.random() < 0.5) {
                jumlahBuahBusuk++;
            } else {
                jumlahBuahBaik++;
            }
        }

        System.out.println("Jumlah buah busuk = " + jumlahBuahBusuk);
        System.out.println("Jumlah buah bagus = " + jumlahBuahBaik);
    }
}
