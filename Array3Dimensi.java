public class fitrayana {
    public static void main(String[] args) {
        // Mendefinisikan array tiga dimensi
        int[][][] fitraArray = new int[3][4][5];

        // Mengisi array dengan data
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    fitraArray[i][j][k] = i * 100 + j * 10 + k;
                }
            }
        }

        // Mengakses dan mencetak isi array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.println("fitraArray[" + i + "][" + j + "][" + k + "] = " + fitraArray[i][j][k]);
                }
            }
        }
    }
}
