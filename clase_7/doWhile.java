package clase_7;
import java.util.Scanner;
public class doWhile {
    public static void main(String[] args){
        int[] numeros = new int[5];
        Scanner teclado = new Scanner(System.in);
        int contador = 0;

        do{
            System.out.println("Ingrese el numero");
            int numero = teclado.nextInt();
            numeros[contador] = numero;
            contador++;

        }while (contador < numeros.length);
    System.out.println("Los numeros ingresados son:");
    contador= 0 ;
        do{
            System.out.print(numeros[contador]);
            contador++;
        }while (contador < numeros.length);
    }
}
