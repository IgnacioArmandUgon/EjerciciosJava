package Ejercicios.Ejercicio17;

import java.util.Arrays;
import java.util.List;

public class Electrodomestico{
    protected final int precio_base = 100;
    protected final String color = "blanco";
    protected final char consumo = 'f';
    protected final int peso = 5;
    protected final List<String> colores = Arrays.asList("blancos", "negro", "rojo", "azul", "gris");
    protected final List<Character> letras = Arrays.asList('a','b','c','d','e','f');

    public Electrodomestico(){};

    public Electrodomestico(int precio, int peso){
        System.out.println("El precio total es: "+ precioTotal(precio, peso)+"$");
    };

    public Electrodomestico(int precio, String color, char consumo, int peso) {
        System.out.println("El consumo es de "+comprobarConsumoEnergetico(consumo));
        System.out.println("El color es "+comprobarColor(color));
        System.out.println("El precio total es: "+ precioTotal(precio, consumo, peso)+"$");
    }

    /**
     * Este metodo comprueba si el consumo ingresado es valido. Si no, devuelve el por defecto
     * @param letra
     * @return
     */

    protected char comprobarConsumoEnergetico(char letra){
        if(letras.contains(letra)){
            return letra;
        };
        return this.consumo;
    }

    /**
     * Este metodo comprueba si el color ingresado es valido. Si no, devuelve el por defecto
     * @param color
     * @return
     */

    protected String comprobarColor(String color){
        if(colores.contains(color)){
            return color;
        }
        return this.color;
    }

    /**
     * Este metodo toma como parametros el consumo y el peso del electrodomestico y
     * en base a eso calcula su precio total
     * @param consumo
     * @param peso
     * @return
     */

    protected int precioTotal(int precio, char consumo, int peso) {
        int total = this.precio_base + precio;
        if(consumo == 'a') total += 100;
        if(consumo == 'b') total += 80;
        if(consumo == 'c') total += 60;
        if(consumo == 'd') total += 50;
        if(consumo == 'e') total += 30;
        if(consumo == 'f') total += 10;

        if(peso < 20) total += 10;
        if(peso >= 20 && this.peso < 50) total += 50;
        if(peso >= 50 && this.peso < 80) total += 80;
        if(peso >= 80) total += 100;

        return total;
    }

    /**
     * Este metodo toma como parametros el peso del electrodomestico y
     * en base a eso calcula su precio total
     * @param peso
     * @return
     */

    protected int precioTotal(int precio, int peso) {
        int total = this.precio_base + precio;

        if(peso < 20) total += 10;
        if(peso >= 20 && this.peso < 50) total += 50;
        if(peso >= 50 && this.peso < 80) total += 80;
        if(peso >= 80) total += 100;

        return total;
    }

    /* Métodos Getters y Setters*/

    public int getPrecio_base() {return precio_base;}

    public String getColor() {return color;}

    public char getConsumo() {return consumo;}

    public int getPeso() {return peso;}

}
