package Ejercicios.Ejercicio17;


import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        //int resolucion, boolean sintonizadorTDT, int precio, String color, char consumo, int peso
        //(int carga, int precio, String color, char consumo, int peso
        List<Electrodomestico> electrodomesticos = new ArrayList<>();

        electrodomesticos.add(new Television(20, true, 100, "negro", 'z', 30));
        electrodomesticos.add(new Television(30, true, 150, "fluor", 'a', 30));
        electrodomesticos.add(new Electrodomestico(150, "negro", 'c', 30));
        electrodomesticos.add(new Television(100, true, 100, "rojo", 'k', 30));
        electrodomesticos.add(new Television(15, false, 200, "negro", 'd', 30));
        electrodomesticos.add(new Lavadora(5, 100, "amarillo", 'd', 10));
        electrodomesticos.add(new Electrodomestico(300, "amarillo", 'c', 25));
        electrodomesticos.add(new Lavadora(5, 200, "ruby", 'g', 50));
        electrodomesticos.add(new Electrodomestico(100, "amarillo", '$', 15));
        electrodomesticos.add(new Lavadora(30, 200, "zafiro", 'a', 5));

        int total = 0;
        int lavadoras = 0;
        int teles = 0;
        int electros = 0;
        for (Electrodomestico el : electrodomesticos) {
            total = total + el.precioTotal();
        }
        for (Electrodomestico el : electrodomesticos) {
            if (el instanceof Lavadora) lavadoras = lavadoras + el.precioTotal();
        }
        for (Electrodomestico el : electrodomesticos) {
            int suma = 0;
            if (el instanceof Television) teles = teles + el.precioTotal();
        }
        for (Electrodomestico el : electrodomesticos) {
            int suma = 0;
            if (el instanceof Electrodomestico) electros = electros + el.precioTotal();
        }

        System.out.println("total: " + total + "( " + "electrodomesticos: " + electros + ", " +
                "lavadoras: " + lavadoras + ", televisores: " + teles + ")");


    }
    }
