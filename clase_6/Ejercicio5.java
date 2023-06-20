package clase_6;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args){
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese el nokbre de la celebridad: ");
        String celebridad = dato.next();
        System.out.println("Aqui esta el Twitts de: "+celebridad);
        System.out.println("https://twitter.com/search?q="+celebridad);
    }
}
