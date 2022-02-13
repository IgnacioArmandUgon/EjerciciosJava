package Ejercicios;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        int num = 0;

        while(contador == 0){
            System.out.println("###### GESTION CINEMATOGRÁFICA ######\n" +
                    "1-NUEVO ACTOR\n" +
                    "2-BUSCAR ACTOR\n" +
                    "3-ELIMINAR ACTOR\n" +
                    "4-MODIFICAR ACTOR\n" +
                    "5-VER TODOS LOS ACTORES\n" +
                    "6- VER PELICULAS DE LOS ACTORES\n" +
                    "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                    "8-SALIR");
            if(entrada.hasNextInt()){
                num = entrada.nextInt();
            }else{
                System.out.println("Debes ingresar un numero. El programa acaba de crashear");
                break;
            }

        switch(num){
            case 1: case 2: case 3: case 4: case 5: case 6: case 7:
                System.out.println("Todo funciona bien");
                System.out.println();
                break;
            case 8: contador = 1;
                System.out.println("Programa cerrado");
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
    }}
}
