package Ejercicios;

import java.util.ArrayList;
import java.util.List;

//Hice todo en un solo archivo solo por practicidad

public class Ejercicio18 {
    public static void main(String[] args) {
        List<Serie> series = new ArrayList<>();

        series.add(new Serie("The Boys", 2, "Humor negro", "Eric Kripke"));
        series.add(new Serie("Invincible", "Robert Kirkman"));
        series.add(new Serie("Daredevil", "Drew Goddard"));
        series.add(new Serie("Padre de familia", "Seth MacFarlane"));
        series.add(new Serie("Better call Saul", 5, "Drama criminal", "Vince Gilligan"));

        List<VideoJuego> juegos = new ArrayList<>();

        juegos.add(new VideoJuego("Subnautica",  90,"Supervivencia", "Unknown Worlds"));
        juegos.add(new VideoJuego("Starcraft", 31, "Estrategia", "Blizzard"));
        juegos.add(new VideoJuego("Stellaris", 304, "Estrategia macro", "Paradox Interactive"));
        juegos.add(new VideoJuego("Smite", "Hi Rez"));
        juegos.add(new VideoJuego("Don't Starve", 309,"Supervivencia", "Klei"));

        series.get(2).entregar();
        series.get(4).entregar();

        juegos.get(1).entregar();
        juegos.get(3).entregar();
        juegos.get(4).entregar();

        System.out.println(seriesEntregadas(series));
        System.out.println(juegosEntregados(juegos));
        System.out.println(masTemporadas(series));
        System.out.println(masHoras(juegos));
    }



    public static class Serie implements Entregable{
        private String titulo;
        private int nro_temporadas = 3;
        private boolean entregado = false;
        private String genero;
        private String creador;

        /* Constructores */

        private Serie() {
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


    public static class VideoJuego implements Entregable{
        private String titulo;
        private int horas_estimadas = 10;
        private boolean entregado = false;
        private String genero;
        private String compania;

        /* Constructores */

        private VideoJuego() {
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

    public interface Entregable {
        void entregar();
        void devolver();
        boolean isEntregado();
        String comparteTo(Object a);
    }

    /**
     * Este metodo recibe una lista de objetos tipo Serie y devuelve un String con las
     * que fueron entregadas de esa lista.
     * @param series
     * @return
     */
    public static String seriesEntregadas(List<Serie> series){
        int cantidad = 0;
        String resultado = "";
        for (Serie serie: series){
            if(serie.isEntregado()){
                cantidad++;
                resultado += (serie.getTitulo()+". ");
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Las series entregadas son ");
        sb.append(cantidad);
        sb.append(". ");
        sb.append(resultado);
        return sb.toString();
    }

    /**
     * Este metodo recibe una lista de objetos tipo Juego y devuelve un String con los
     * que fueron entregados de esa lista.
     * @param juegos
     * @return
     */
    public static String juegosEntregados(List<VideoJuego> juegos){
        int cantidad = 0;
        String resultado = "";
        for (VideoJuego juego: juegos){
            if(juego.isEntregado()){
                cantidad++;
                resultado += (juego.getTitulo()+". ");
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Los juegos entregados son ");
        sb.append(cantidad);
        sb.append(". ");
        sb.append(resultado);
        return sb.toString();
    }

    /**
     * Este metodo recibe una lista de series y devuelve un String con la serie que tiene mas temporadas
     * @param series
     * @return
     */
    public static String masTemporadas(List<Serie> series){
        String resultado = "";
        for(int i = 0; i < series.size()-1; i++){
            if(series.get(i).comparteTo(series.get(i+1)).equals("mayor")) {
                resultado = series.get(i).getTitulo();
            }else {
                resultado = series.get(i+1).getTitulo();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Las series con mas temporadas es ");
        sb.append(resultado);
        return sb.toString();
    }

    /**
     * Este metodo recibe una lista de juegos y devuelve un String con el juego que tiene mas horas
     * @param juegos
     * @return
     */
    public static String masHoras(List<VideoJuego> juegos){
        String resultado = "";
        for(int i = 0; i < juegos.size()-1; i++){
            if(juegos.get(i).comparteTo(juegos.get(i+1)).equals("mayor")) {
                resultado = juegos.get(i).getTitulo();
            }else {
                resultado = juegos.get(i+1).getTitulo();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("El juego con mas horas es ");
        sb.append(resultado);
        return sb.toString();
    }
}

