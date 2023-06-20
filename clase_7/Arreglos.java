package clase_7;
import java.util.Scanner;
public class Arreglos {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        // este e un arreglo que me permite guardar varios datos dentro de una vbariable de manera ordenada
        int [] numero = new int[5];

        int contador = 0;
        while (contador < numero.length){
            System.out.println("Ingrese un numero: ");
            int numeroDigitado = teclado.nextInt();;
            numero[contador] = numeroDigitado;
            contador++;
        }
        // la variable contador ya fue definida asi que obviamos el int
        contador = 0;
        while (contador < numero.length){
            System.out.print(numero[contador]);
            contador++;
        }
    }
}
