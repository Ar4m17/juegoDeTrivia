package clase_5;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese el precio original del producto: ");
        double precioOriginal = datos.nextDouble();
        System.out.println("Ingrese el porcentaje del descuento: ");
        double descueto = datos.nextDouble();
        double pregiofinal = precioOriginal-(precioOriginal*descueto/100);

        System.out.println("El precio original es: "+ precioOriginal + " Soles.");
        System.out.println("El descuento es: "+ descueto + "%");
        System.out.println("El precio final del producto es: "+ pregiofinal + " Soles.");

    }

}
