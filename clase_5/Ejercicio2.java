package clase_5;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main (String[] args){
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese la distancia en millas: ");
        double millas = datos.nextDouble();

        double millasakilometros = millas*1.60934;

        System.out.println("La distancia en Kilometros sera: " + millasakilometros + " km");


    }
}
