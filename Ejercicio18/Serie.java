package Ejercicios.Ejercicio18;



public class Serie implements Entregable {
    private String titulo;
    private int nro_temporadas = 3;
    private boolean entregado = false;
    private String genero;
    private String creador;

    /* Constructores */

    public Serie() {
    }

    public Serie(String titulo, String creador){
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int nro_temporadas, String genero, String creador) {
        this.titulo = titulo;
        this.nro_temporadas = nro_temporadas;
        this.genero = genero;
        this.creador = creador;
    }

    /* Métodos Getters y Setters */

    public String getTitulo() {return titulo;}

    public void setTitulo(String titulo) {this.titulo = titulo;}

    public int getNro_temporadas() {return nro_temporadas;}

    public void setNro_temporadas(int nro_temporadas) {this.nro_temporadas = nro_temporadas;}

    public String getGenero() {return genero;}

    public void setGenero(String genero) {this.genero = genero;}

    public String getCreador() {return creador;}

    public void setCreador(String creador) {this.creador = creador;}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Serie{");
        sb.append("titulo='");
        sb.append(titulo);
        sb.append(", nro_temporadas=");
        sb.append(nro_temporadas);
        sb.append(", entregado=");
        sb.append(entregado);
        sb.append(", genero='");
        sb.append(genero);
        sb.append(", creador='");
        sb.append(creador);
        sb.append("}");
        return sb.toString();
    }

    /*Métodos de la interfaz implementada*/

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public String comparteTo(Object a) {
        Serie serie = (Serie)a;
        if(this.nro_temporadas > serie.nro_temporadas) return "mayor";
        return "menor";
    }
}
