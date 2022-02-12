package Ejercicios.Ejercicio18;

import java.util.List;

public class ManejoSeries {
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
}
