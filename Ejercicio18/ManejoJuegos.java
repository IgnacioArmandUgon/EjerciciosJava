package Ejercicios.Ejercicio18;

import java.util.List;

public class ManejoJuegos {
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
