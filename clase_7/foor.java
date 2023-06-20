package clase_7;
import java.util.Scanner;
public class foor {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int [] numeros = new int[5];
        for(int contador = 0;contador < numeros.length;contador++){
            System.out.println("Ingrese un numero; ");
            int numero = teclado.nextInt();
            numeros[contador] = numero;
        }
        System.out.println("Los numeros que ingreso son: ");
        for(int contador= 0 ;contador < numeros.length;contador++){
            System.out.println(numeros[contador]);
        }
        int mayor= 0;
        int menor= 0;
        System.out.println("Los numeros que ingreso son: ");
        for(int contador= 0 ;contador < numeros.length;contador++){
            int num = numeros[contador]; // creamos la variable num que nos ayudara a agarrar los numeros que guardamos en el arreglo para usarlos en la logica de abajo.
            if(num >= mayor || contador ==0){
                mayor = num;
            }
            if(num <= menor || contador ==0){
                menor = num;
            }
        }
        System.out.println("Numero mayor: "+ mayor);
        System.out.println("Numero menor: "+ menor);
        int sumatoria= 0 ;
        for(int contador= 0 ; contador< numeros.length;contador++){
            int num = numeros[contador];
            sumatoria += num;
        }
        System.out.println("La sumatoria es: "+sumatoria);
        float promedio = (float) sumatoria / numeros.length;
        System.out.println("El promedio es: "+promedio);
    }
}
