package clase_5;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main (String[] args){
        Scanner datos = new Scanner(System.in);
        System.out.println("Cuantos años tiene tu perro? ");
        Integer edadperro = datos.nextInt();

        Integer edadenhumano = edadperro * 7;
        System.out.println("La edad de tu perro en un humano seria: "+ edadenhumano + " años.");
    }
}
