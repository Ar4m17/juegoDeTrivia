package clase_6;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main (String[] args){
        Scanner dato = new Scanner(System.in);
        System.out.println("ingrese el primero numero: ");
        int numero1 = dato.nextInt();
        System.out.println("ingrese el segundo numero: ");
        int numero2 = dato.nextInt();
        System.out.println("ingrese el tercero numero: ");
        int numero3 = dato.nextInt();

    // este metodo sirve para simplificar el estar usando if

        int mayor = obtenerMayor(numero1, numero2, numero3);
        int menor = obtenerMenor(numero1, numero2, numero3);

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
    // en su estado normal solo sirve para 3 caracteres(a,b,c) pero se le pueden añadir mas usandoi este otro metodo:
    /*

         public static int obtenerMayor(int... numeros) {
        int mayor = Integer.MIN_VALUE;
        for (int num : numeros) {
        if (num > mayor) {
            mayor = num;
        }
    }
    return mayor;
}

         public static int obtenerMenor(int... numeros) {
        int menor = Integer.MAX_VALUE;
        for (int num : numeros) {
        if (num < menor) {
            menor = num;
        }
    }
    return menor;
}

     */
    // con esto se podran admitir mas caracteres por ejemplo:
    /*
        int mayor = obtenerMayor(5, 9, 2, 7, 1);
        int menor = obtenerMenor(5, 9, 2, 7, 1);
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

     */
    public static int obtenerMayor(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
    public static int obtenerMenor(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }


}
