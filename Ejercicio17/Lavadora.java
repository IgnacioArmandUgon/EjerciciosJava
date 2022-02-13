package Ejercicios.Ejercicio17;


public class Lavadora extends Electrodomestico {
    private int carga;

    public Lavadora(){
        super();
        this.carga = 5;
    }
    public Lavadora(int precio,int peso){
        super(precio, peso);
        this.carga = 5;
    }

    public Lavadora(int carga, int precio, String color, char consumo, int peso){
        super(precio, color, consumo, peso);
        this.precio = this.precioTotal();
        this.carga = carga;
    }

    public int precioTotal() {
        int total = super.precioTotal();
        if(this.carga>30)total = total+ 30;
        return total;
    }

    public int getCarga(){return this.carga;}
}