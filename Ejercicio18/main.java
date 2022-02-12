package Ejercicios.Ejercicio18;

import java.util.ArrayList;
import java.util.List;

import static Ejercicios.Ejercicio18.ManejoJuegos.*;
import static Ejercicios.Ejercicio18.ManejoSeries.*;

public class main {
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



}
