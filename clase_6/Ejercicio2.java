package clase_6;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main (String[] args){
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingresar el primer numero: ");
        int numero1 = dato.nextInt();
        System.out.println("Ingresar el segundo numero: ");
        int numero2 = dato.nextInt();
        System.out.println("Ingresar el tercero numero: ");
        int numero3 = dato.nextInt();

        double promedio = (numero1+numero2+numero3)/3;

        System.out.println("El promedio de los numeros "+ numero1+"; "+numero2+"; "+numero3+": es "+ promedio);

    }
}
