package Ejercicios;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ejercicio13 {
    public static void main(String[] args) {

        System.out.println(darFechaActual());
    }

    /**
     * Este metodo devuelve la fecha y hora actual en un formato legible.
     * @return
     */
    public static String darFechaActual(){
        LocalDate fecha = LocalDate.now();
        LocalTime hora = LocalTime.now();
        String fechayhora = fecha.getDayOfMonth()+"/"+fecha.getMonthValue()+"/"+fecha.getYear()+" " +
                ""+hora.getHour()+":"+hora.getMinute()+":"+hora.getSecond();
        return fechayhora;
    }
}
