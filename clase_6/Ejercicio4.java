package clase_6;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args){
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese el pais que desea buscar: ");
        String pais = dato.next();
        System.out.println("Aqui esta la ubicacion en Google maps:");
        System.out.println("“https://www.google.com/maps/search/"+pais);
    }
}
