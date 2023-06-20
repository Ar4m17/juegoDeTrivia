package clase_6;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingresar el numero: ");
        int numero = dato.nextInt();
        if(numero%2==0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
}
