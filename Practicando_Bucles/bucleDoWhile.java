package Practicando_Bucles;
import java.util.Scanner;
public class bucleDoWhile {
    public static void main(String[] args){
        // en do while las intrucciones se ejecutan almenos 1 ves antes que la condision la evalue.
        int i =  1;
        do{
            System.out.print(i);
            if(i<10){
                System.out.print("; ");
            }
            i++;
        } while (i<=10); // en caso la instruccion sea leida por la condicion y esta fuese falsa votara 1 sola ves la instruccion.


    }
}
