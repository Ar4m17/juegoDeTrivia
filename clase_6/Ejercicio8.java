package clase_6;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bienvenido al juego de Piedra, Papel, Tijeras");
        System.out.println("Ingresa tu elección: piedra, papel o tijeras");
        String usuario = scanner.nextLine().toLowerCase();

        int computadoraNumero = random.nextInt(3); // Genera un número aleatorio entre 0 y 2
        String computadora = "";
        switch (computadoraNumero) {
            case 0:
                computadora = "piedra";
                break;
            case 1:
                computadora = "papel";
                break;
            case 2:
                computadora = "tijeras";
                break;
        }

        System.out.println("La computadora eligió: " + computadora);

        if (usuario.equals(computadora)) {
            System.out.println("Es un empate");
        } else if (usuario.equals("piedra")) {
            if (computadora.equals("papel")) {
                System.out.println("¡La computadora gana!");
            } else {
                System.out.println("¡Tú ganas!");
            }
        } else if (usuario.equals("papel")) {
            if (computadora.equals("tijeras")) {
                System.out.println("¡La computadora gana!");
            } else {
                System.out.println("¡Tú ganas!");
            }
        } else if (usuario.equals("tijeras")) {
            if (computadora.equals("piedra")) {
                System.out.println("¡La computadora gana!");
            } else {
                System.out.println("¡Tú ganas!");
            }
        } else {
            System.out.println("Entrada no válida. Por favor, ingresa piedra, papel o tijeras.");
        }
    }
}
