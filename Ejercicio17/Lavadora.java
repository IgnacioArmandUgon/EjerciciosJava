package Ejercicios.Ejercicio17;


public class Lavadora extends Electrodomestico {
    private int carga = 5;

    public Lavadora(){}
    public Lavadora(int precio,int peso){
        super(precio, peso);
    }

    public Lavadora(int carga, int precio, String color, char consumo, int peso){
        System.out.println("El consumo es de "+super.comprobarConsumoEnergetico(consumo));
        System.out.println("El color es "+super.comprobarColor(color));
        System.out.println("El precio total es de "+precioTotal(precio, carga, peso, consumo)+"€");
    }

    private int precioTotal(int precio,int carga, int peso, char consumo) {
        int total = super.precioTotal(precio, peso) + precio;
        if(carga>30)total += 30;
        return total;
    }

    public int getCarga(){return this.carga;}
}