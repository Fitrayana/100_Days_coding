import java.math.BigDecimal;


public class fitra{
    public static void main(String[] args) {
        BigDecimal tam= new BigDecimal("1111111111111111.2222222222222222222222");
        BigDecimal bah= new BigDecimal("3333333333333333.4444444444444444444444");
        
        BigDecimal tambah =tam.add(bah);
        
        System.out.println("hasil penjumlahan BigDecimal: "+tambah);
    }
}
