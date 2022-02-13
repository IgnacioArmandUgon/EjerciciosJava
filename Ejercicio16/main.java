package Ejercicios.Ejercicio16;


import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese edad");
        int edad = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese sexo");
        String sexo = entrada.nextLine();
        System.out.println("Ingrese peso");
        int peso = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese altura");
        double altura = Double.parseDouble(entrada.nextLine());


        Persona persona1 = new Persona(nombre, edad,sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();
        persona3.setNombre("Ana");
        persona3.setEdad(22);
        persona3.setPeso(62);
        persona3.setAltura(1.65);

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());

    }
}
