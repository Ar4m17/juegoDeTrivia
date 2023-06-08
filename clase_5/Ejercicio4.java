package clase_5;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args){
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese el total de la cuenta del restaurante: ");
        double totalCuenta = datos.nextDouble();
        System.out.println("Ingrese el porcentaje de propina que desea dejar: ");
        double propina = datos.nextDouble();

        double montoPropina = totalCuenta * (propina/100);

        System.out.println("El total de la cuenta del restaurante salio: " + totalCuenta + " Soles.");
        System.out.println("El porcentaje de propina que dejo fue: " + propina + " %.");
        System.out.println("El monto final de la propina es: " + montoPropina + " Soles.");
    }
}
