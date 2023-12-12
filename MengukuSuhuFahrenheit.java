import java.util.Scanner;

public class fitra{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.print("Masukkan suhu dalam Celsius: ");

        double suhuCelsius = scanner.nextDouble();



        double suhuFahrenheit = konversiCelsiusKeFahrenheit(suhuCelsius);



        System.out.println("Suhu dalam Fahrenheit: " + suhuFahrenheit);



    }



    private static double konversiCelsiusKeFahrenheit(double suhuCelsius) {

        return (suhuCelsius * 9/5) + 32; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }

}
