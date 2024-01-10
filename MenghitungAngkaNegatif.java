import java.util.Scanner;

public class fitra {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        int i = 0;
        int jumlah = 0;
        
        do{
            System.out.println("masukkan angka negatif: ");
            int angka = sc.nextInt();
            
            if(angka <0 ){
                jumlah += angka;
            }
            i++;
        }while (i < 3);
        System.out.println("jumlah angka negatif: "+jumlah);
    }
            
}
