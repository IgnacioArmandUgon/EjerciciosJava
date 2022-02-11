package Ejercicios;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("###### Impares del 1 al 100 ######");
        int contadorImpares = 1;
        while(contadorImpares <= 100){
            System.out.println(contadorImpares);
            contadorImpares = contadorImpares + 2;
        }
        System.out.println("###### Pares del 1 al 100 ######");
        int contadorPares = 0;
        while(contadorPares <= 100){
            System.out.println(contadorPares);
            contadorPares = contadorPares + 2;
        }
    }
}
