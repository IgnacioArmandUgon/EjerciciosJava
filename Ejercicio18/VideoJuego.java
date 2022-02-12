package Ejercicios.Ejercicio18;



public class VideoJuego implements Entregable {
    private String titulo;
    private int horas_estimadas = 10;
    private boolean entregado = false;
    private String genero;
    private String compania;

    /* Constructores */

    public VideoJuego() {
    }

    public VideoJuego(String titulo, String compania){
        this.titulo = titulo;
        this.compania = compania;
    }

    public VideoJuego(String titulo, int horas_estimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horas_estimadas = horas_estimadas;
        this.genero = genero;
        this.compania= compania;
    }

    /* Métodos Getters y Setters */

    public String getTitulo() {return titulo;}

    public void setTitulo(String titulo) {this.titulo = titulo;}

    public int getHoras_estimadas() {return horas_estimadas;}

    public void setHoras_estimadas(int horas_estimadas) {this.horas_estimadas = horas_estimadas;}

    public String getGenero() {return genero;}

    public void setGenero(String genero) {this.genero = genero;}

    public String getCompania() {return compania;}

    public void setCompania(String compania) {this.compania = compania;}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Serie{");
        sb.append("titulo='");
        sb.append(titulo);
        sb.append(", horas_estimadas=");
        sb.append(horas_estimadas);
        sb.append(", entregado=");
        sb.append(entregado);
        sb.append(", genero='");
        sb.append(genero);
        sb.append(", compania='");
        sb.append(compania);
        sb.append("}");
        return sb.toString();
    }

    /*Métodos de la interfaz implementada*/

    @Override
    public void entregar() {this.entregado = true;}

    @Override
    public void devolver() {this.entregado = false;}

    @Override
    public boolean isEntregado() {return this.entregado;}

    @Override
    public String comparteTo(Object a) {
        VideoJuego juego = (VideoJuego)a;
        if(horas_estimadas > juego.horas_estimadas) return "mayor";
        return "menor";

    }
}
