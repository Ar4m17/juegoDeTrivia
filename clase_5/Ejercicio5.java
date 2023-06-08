package clase_5;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main (String[] args){
        Scanner datos = new Scanner(System.in);
        System.out.println("BIENVENIDO AL JUEGO DE LA ADIVINANZA.");
        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("por favor ingrese el nuemero entero para acomenzar: ");
        Integer numero = datos.nextInt();
        System.out.println("ah continuacion la computadora generara un numerop aleatorio");
        Integer numeroRandom = (int)(Math.random()*10);
        System.out.println("si adivina se ganara un viaje a japon todo pagado ");
        System.out.println("El numero que seleccciona la computadora es: " + numeroRandom);

        if(numero == numeroRandom){
            System.out.println("FELICIDADES. Ganaste el viaje a japon todo pagado");
        }else {
            System.out.println("Mala suerte sigue intentando");
        }
    }
}
