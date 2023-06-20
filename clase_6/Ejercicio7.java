package clase_6;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args){
        Scanner dato = new Scanner(System.in);
        System.out.println("¡Bienvenido a Elige tu propia historia!");
        System.out.println("Es una noche estrellada, te encuentras en un bosque misterioso:");

        int rutas;

        while (true){
            System.out.println("1. Exploras la oscuridad en busca de la fuente de un susurro escalofriante");
            System.out.println("2. Sigues el sendero iluminado hacia una pequeña cabaña acogedora");
            System.out.print("Elige tu ruta (1 o 2): ");
            rutas = dato.nextInt();

            if(rutas==1 || rutas==2){
                break;
            }else{
                System.out.println("Ruta inválida. Por favor, elige 1 o 2.");
            }
        }

        if (rutas==1){
            System.out.println("Decides explorar la oscuridad en busca de la fuente de un susurro escalofriante, te das cuenta que hay don caminos:");

            while(true){
                System.out.println("1. El primer camino te lleva hacia la fuente de un susurro escalofriante, pero es posible que mueras en el trascurso por la variedad de trampas que se encuentran");
                System.out.println("2. El segundo camino sales del bosque a salvo y te diriges al pueblo mas cercano");
                rutas = dato.nextInt();

                if (rutas == 1 || rutas == 2) {
                    break;
                }else{
                    System.out.println("Ruta inválida. Por favor, elige 1 o 2.");
                }
            }
        }else if(rutas==2){ // ELSEIFF permite regresar al anterior iff y plantear otra opsion como else.
            System.out.println("Decides seguir el sendero iluminado hacia la pequeña cabaña acogedora. Al llegar a la cabaña, te das cuenta de que hay dos puertas:");

            while(true){
                System.out.println("1. Entras por la puerta de la izquierda ");
                System.out.println("2) Optas por la puerta de la derecha");
                rutas = dato.nextInt();

                if (rutas == 1 || rutas == 2) {
                    break;
                }else{
                    System.out.println("Ruta inválida. Por favor, elige 1 o 2.");
                }
            }
            if (rutas==1){

                System.out.println("Al abrir la puerta de la izquierda, te encuentras con una habitación llena de tesoros brillantes y mágicos. Te maravillas con las joyas y los objetos preciosos que llenan la sala. Te das cuenta de que has encontrado el legendario tesoro perdido del bosque. Con tu corazón lleno de emoción y riquezas, decides regresar a casa para compartir tu increíble aventura con el mundo. ");
                System.out.println("¡Felicidades, has tenido un final exitoso en tu búsqueda!");
            }else if(rutas==2){
                System.out.println("Entras por la puerta de la derecha y te encuentras un Mounstro");
                System.out.println("¡MUERES POR GIL PIPIPI!");
            }
        }
    }
}


 /*
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido a la aventura!");
        System.out.println("Estás en un bosque oscuro y debes elegir tu camino.");

        int opcion;

        while (true) {
            System.out.println("1. Camino de la derecha");
            System.out.println("2. Camino de la izquierda");
            System.out.print("Elige tu opción (1 o 2): ");
            opcion = scanner.nextInt();

            if (opcion == 1 || opcion == 2) {
                break;
            } else {
                System.out.println("Opción inválida. Por favor, elige 1 o 2.");

            }
        }

        if (opcion == 1) {
            System.out.println("Has elegido el camino de la derecha.");
            System.out.println("Te encuentras con un río y un puente.");

            while (true) {
                System.out.println("1. Cruzar el puente");
                System.out.println("2. Seguir el río");
                System.out.print("Elige tu opción (1 o 2): ");
                opcion = scanner.nextInt();

                if (opcion == 1 || opcion == 2) {
                    break;
                } else {
                    System.out.println("Opción inválida. Por favor, elige 1 o 2.");
                }
            }

            if (opcion == 1) {
                System.out.println("Cruzas el puente y encuentras un tesoro.");
                System.out.println("¡Felicidades! Has ganado la aventura.");
            } else if (opcion == 2) {
                System.out.println("Sigues el río y te encuentras con un grupo de lobos.");
                System.out.println("¡Oh no! Los lobos te atacan y no logras sobrevivir.");
                System.out.println("Fin de la aventura.");
            }

        } else if (opcion == 2) {
            System.out.println("Has elegido el camino de la izquierda.");
            System.out.println("Encuentras una cueva oscura.");

            while (true) {
                System.out.println("1. Entrar a la cueva");
                System.out.println("2. Continuar por el camino");
                System.out.print("Elige tu opción (1 o 2): ");
                opcion = scanner.nextInt();

                if (opcion == 1 || opcion == 2) {
                    break;
                } else {
                    System.out.println("Opción inválida. Por favor, elige 1 o 2.");
                }
            }

            if (opcion == 1) {
                System.out.println("Entras a la cueva y encuentras un mapa antiguo.");
                System.out.println("Usas el mapa para encontrar un tesoro escondido.");
                System.out.println("¡Felicidades! Has ganado la aventura.");
            } else if (opcion == 2) {
                System.out.println("Sigues por el camino y te encuentras con un ladrón.");
                System.out.println("El ladrón te roba todas tus pertenencias.");
                System.out.println("¡Oh no! Has perdido la aventura.");
            }
        }

        scanner.close();
    }
}

 */



