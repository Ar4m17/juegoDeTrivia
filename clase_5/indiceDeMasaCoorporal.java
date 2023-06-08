package clase_5;

import java.util.Scanner;
public class indiceDeMasaCoorporal {
    public static void main(String [] args){
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese su peso en Kg? ");
        double peso = datos.nextDouble();
        System.out.println("Ingrese su altura en metros? ");
        double altura = datos.nextDouble();

        double indiceDeMasaCoorporal= peso / (altura*altura);
        System.out.println("Usted pesa: " + peso + " Kg");
        System.out.println("Su Altura es: " + altura + " metros");
        System.out.println("Su Indice de Masa Coorporal es: " + indiceDeMasaCoorporal);

        if (indiceDeMasaCoorporal >=30 ) {
            System.out.println("Estas en estado de obesidad. ");
        }
        if (indiceDeMasaCoorporal >=25 && indiceDeMasaCoorporal < 30 ) {
            System.out.println("Estas en estado de sobrepeso. ");
        }
        if (indiceDeMasaCoorporal >=18.6 && indiceDeMasaCoorporal < 25 ) {
            System.out.println("Estas en estado normal. ");
        }
        if (indiceDeMasaCoorporal < 18.6) {
            System.out.println("Estas en estado menor al normal. ");
        }
    }
}