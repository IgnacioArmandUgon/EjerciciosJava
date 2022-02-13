package Ejercicios.Ejercicio17;

public class Television extends Electrodomestico {
    private final int resolucion = 20;
    private final boolean sintonizadorTDT = false;

    public Television(){}

    public Television(int precio, int peso){
        super(precio,peso);
   }
   public Television(int resolucion, boolean sintonizadorTDT, int precio, String color, char consumo, int peso){
       System.out.println("El consumo es de "+super.comprobarConsumoEnergetico(consumo));
       System.out.println("El color es "+super.comprobarColor(color));
       System.out.println("El precio total es de "+precioTotal(precio ,resolucion,sintonizadorTDT, peso, consumo)+"€");
   }

    private int precioTotal(int precio ,int resolucion, boolean sintonizadorTDT, int peso, char consumo) {
        int total = super.precioTotal(precio, peso) + precio;
        if(resolucion>40)total += (total/100)*30;
        if(sintonizadorTDT)total += 50;
        return total;
    }

    public int getResolucion() {return resolucion;}
    public boolean isSintonizadorTDT() {return sintonizadorTDT;}
}
