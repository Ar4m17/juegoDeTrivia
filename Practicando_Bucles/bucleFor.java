package Practicando_Bucles;
import java.util.Scanner;
public class bucleFor {
    public static void main(String[] args){
        // la estructura del bucle for (inicializacion ; condicion ; aumento oi decremento) ahorrandonos lineas de codigo a comparacion de while.
        for (int i=1; i<=10 ; i++){
            System.out.print(i);
            if (i<10){
                System.out.print("; ");
            }
        }
        System.out.println();
        System.out.println("///////////////////////////////////////////////////////////////////////////////////////");
        // PARA LA PRUEBA DE  DECREMENTO Y INGRESO DEDATOS ATRAVES DEL TECLADO.
        System.out.println("Ingrese el numero de inicializacion: ");
        Scanner numero = new Scanner(System.in);
        int inicializacion = numero.nextInt();
        System.out.println("Ingrese el numero de la condicion ( el numero hasta donde llegara i): ");
        int limitador = numero.nextInt();
        System.out.println("Ingresar de cuanto en cuanto va a decrecer: ");
        int cuanto = numero.nextInt();
        for (int i=inicializacion ; i >= limitador ; i=i-cuanto){
            System.out.print(i);
            if (i>limitador){
                System.out.print("; ");
        }
        }
    }
}
