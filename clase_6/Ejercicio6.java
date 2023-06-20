package clase_6;
import java.util.Scanner;
public class Ejercicio6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numero = 0;
            boolean numeroValido = false;

            while (!numeroValido) { // utilizamos la condicion "!numerovalido" el sera el punto de quiebre del bucle
                System.out.println("Ingrese el numero telefonico; ");
                numero = scanner.nextInt();

                if (numero >= 100000000 && numero <= 999999999) {
                    numeroValido = true; // aqui es donde el bucle se rompe al ingresar el numero correcto con la condicion TRUE
                } else {
                    System.out.println("El número de telefono no es valido. Inténtalo de nuevo.");
                }
            }
            System.out.println("El numero en whatsapp: ");
            System.out.println("https://api.whatsapp.com/send?phone=" + numero);
        }
    }
