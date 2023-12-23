import java.util.Random;

public class fitra {

    public static void main(String[] args) {
     
        String[] siswa = {"Fitra", "Madinah", "nengsi", "rani", "imah", "abdillah", "syahka", "dirga", "hisyam", "irwan", "fatwa", "dini", "ifa", "faras", "zaki"};

        String[] jadwalPiket = new String[siswa.length];

        Random random = new Random();
        for (int i = 0; i < jadwalPiket.length; i++) {
            jadwalPiket[i] = siswa[random.nextInt(siswa.length)];
        }
        for (int i = 0; i < jadwalPiket.length; i++) {
            System.out.println("Hari " + (i + 1) + ": " + jadwalPiket[i]);
        }
    }
}
