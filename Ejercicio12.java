package Ejercicios;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese primer palabra");
        String palabra1 = entrada.nextLine();
        System.out.println("Ingrese segunda palabra");
        String palabra2 = entrada.nextLine();

        System.out.println(diferencia(palabra1, palabra2));

        }


    public static String diferencia(String palabra1, String palabra2) {
        if (palabra1 == null) {
            return palabra2;
        }
        if (palabra2 == null) {
            return palabra1;
        }
        if(palabra1.equals(palabra2)){
            return "Las palabras son iguales";
        }
        int index = indexDiferencia(palabra1, palabra2);
        return palabra2.substring(index);
    }

    public static int indexDiferencia(CharSequence cs1, CharSequence cs2) {

        int i;
        for (i = 0; i < cs1.length() && i < cs2.length(); ++i) {
            if (cs1.charAt(i) != cs2.charAt(i)) {
                break;
            }
        }
        if (i < cs2.length() || i < cs1.length()) {
            return i;
        }
        return 0;
    }

    }

