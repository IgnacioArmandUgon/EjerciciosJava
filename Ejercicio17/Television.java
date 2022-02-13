package Ejercicios.Ejercicio17;

public class Television extends Electrodomestico {
    private int resolucion;
    private boolean sintonizadorTDT;

    public Television(){
        super();
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    public Television(int precio, int peso){
        super(precio,peso);
        this.resolucion = 20;
        this.sintonizadorTDT = false;
   }
   public Television(int resolucion, boolean sintonizadorTDT, int precio, String color, char consumo, int peso){
        super(precio, color, consumo, peso);
        this.precio = precioTotal();
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
   }

    public int precioTotal() {
        int total = super.precioTotal();
        if(this.sintonizadorTDT)total = total + 50;
        if(this.resolucion>40)total = total + (total/100)*30;
        return total;
    }

    public int getResolucion() {return resolucion;}
    public boolean isSintonizadorTDT() {return sintonizadorTDT;}
}
