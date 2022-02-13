package Ejercicios.Ejercicio17;

import java.util.Arrays;
import java.util.List;

public class Electrodomestico{
    protected int precio;
    protected String color;
    protected char consumo;
    protected int peso;
    protected final List<String> colores = Arrays.asList("blancos", "negro", "rojo", "azul", "gris");
    protected final List<Character> letras = Arrays.asList('a','b','c','d','e','f');

    public Electrodomestico(){
        this.precio = 100;
        this.color = "Blanco";
        this.consumo = 'f';
        this.peso = 5;
    };

    public Electrodomestico(int precio, int peso){
        this.precio = precio;
        this.color = "Blanco";
        this.consumo = 'f';
        this.peso = peso;

    };

    public Electrodomestico(int precio, String color, char consumo, int peso) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.consumo = comprobarConsumoEnergetico(consumo);
        this.peso = peso;
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
     * @return
     */

    protected int precioTotal(/*int precio, char consumo, int peso*/) {
        int total = precio;
        if(consumo == 'a') total += 100;
        if(consumo == 'b') total += 80;
        if(consumo == 'c') total += 60;
        if(consumo == 'd') total += 50;
        if(consumo == 'e') total += 30;
        if(consumo == 'f') total += 10;

        if(peso < 20) total += 10;
        if(peso >= 20 && peso < 50) total += 50;
        if(peso >= 50 && peso < 80) total += 80;
        if(peso >= 80) total += 100;

        return total;
    }

    /* Métodos Getters y Setters*/

    public int getPrecio() {return precio;}

    public String getColor() {return color;}

    public char getConsumo() {return consumo;}

    public int getPeso() {return peso;}

}
