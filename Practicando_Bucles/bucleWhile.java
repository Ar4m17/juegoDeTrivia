package Practicando_Bucles;
import java.util.Scanner;
public class bucleWhile {
    // el bucle while repite la operacion siempre y cuando la condicion quye esta dentro de su parentesis se cumpla, una vez la condicion sea falsa saldra del bucle.
    public static void main(String[] args){
        System.out.println("Ingrese la cantidad de numeros a mostrar en pantalla: ");
        // en el buclke while el iniciador del contador se denomina antes de iniciar la orperacion,
        Scanner dato = new Scanner(System.in);
        int numero1 = dato.nextInt();
        int i=1;
        while (i<=numero1){
        /* RECORDAR:
            System.out.print escribe toda esta linea y la siguiente en consecutivo
            en cambio
            System.out.println lo hace todo en una sola linea pasando a la siguiente para el otro print
         */
                System.out.print(i);
                if (i<10){
                    System.out.print("; ");
                }
        // el creciente o decreciente (ej:i++) siempre va al ultimo pero dentro del while osea de las llaves
                i++;

        }
        System.out.println();
        System.out.println("///////////////////////////////////////////////////////////////////////////////");
        System.out.println("Ingrese otro numero pero para una prubea decreciente: ");
        // este numero que estas ingresando es desde donde va a empresar a decrecer
        int numero2 = dato.nextInt();
        System.out.println("Ahora el numero hasta donde va a decrecer: ");
        // este numerpo que estas ingresando es hasta donde va a decrecer
        int nuemroDecrecienteFinal = dato.nextInt();
        int b = numero2;
        while (b>=nuemroDecrecienteFinal){
            System.out.print(b );
            if (b>nuemroDecrecienteFinal){
                System.out.print("; ");
            }
            b--;
            // la manera de crecer o decrecer el numero tambien puede ser de 2 en 2 o 3en 3 ETC.
        }
    }
}
