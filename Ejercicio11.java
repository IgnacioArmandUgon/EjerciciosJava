package Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su frase");
        String frase = entrada.nextLine();
        int vocales = 0;
        for(int i = 0; i<frase.length(); i++){
            if(("aeiouAEIOUáéíóúÁÉÍÓÚ".indexOf(frase.charAt(i))>= 0)){
                vocales++;
            }
        }
        System.out.println("letras = "+frase.length());
        System.out.println("vocales = " + vocales);
    }
}
