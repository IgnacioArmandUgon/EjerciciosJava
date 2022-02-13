package Ejercicios.Ejercicio16;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Persona {
    private String nombre = "";
    private int edad = 0;
    private String DNI;
    private String sexo = "Hombre";
    private int peso = 0;
    private double altura = 0;

    public Persona(){}


    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        comprobarSexo(sexo);
        this.DNI = generarDNI();
    }

    public Persona(String nombre, int edad,String sexo, int peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.DNI = generarDNI();
        comprobarSexo(sexo);
    }

    /**
     * Este metodo calcula el indice de masa corporal a partir de el peso y la altura.
     * @param peso
     * @param altura
     * @return
     */
    public int calcularIMC(int peso, int altura) {
        int imc = peso/(altura*2);
        if(imc < 20) {
            return -1;
        }
        if(imc > 25){
            return 1;
        }
        return 0;
    }
    public boolean esMayorDeEdad(int edad){
        return edad>= 18;
    }

    public void comprobarSexo(String sexo){
        if(sexo.equalsIgnoreCase("Hombre")){
            this.sexo = "Hombre";
        }
        if(sexo.equalsIgnoreCase("Mujer")){
            this.sexo = "Mujer";
        }
        this.sexo =  "Hombre";
    }

    /**
     * Este metodo genera un DNI random de 8 digitos y un caracter dependiendo de este
     * @return
     */
    public String generarDNI(){
        char letras[] = {'T','R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'};
        int randomNum = ThreadLocalRandom.current().nextInt(10000000, 99999999);
        int suNumero = randomNum%23;
        String DNI = ""+randomNum+letras[suNumero];
        return DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre='");
        sb.append(nombre);
        sb.append(", edad=");
        sb.append(edad);
        sb.append(", DNI=");
        sb.append(DNI);
        sb.append(", sexo=");
        sb.append(sexo);
        sb.append(", peso=");
        sb.append(peso);
        sb.append(", altura=");
        sb.append(altura);
        sb.append("}");
        return sb.toString();
    }

}
