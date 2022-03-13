package co.com.sofka.domain.Generic;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;


public class Fecha implements ValueObject <String> {
    private final LocalDate fecha;
    private final String formato;


    public Fecha(int day, int month, int year){
        try{
            fecha = LocalDate.of(year, month, day);

        }catch (Exception ex){
            throw  new IllegalArgumentException("Error al procesar la fecha ingresada");
        }

        formato = generateFormat();

    }

    private String generateFormat(){
        return fecha.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    @Override
    public String value() {//(3)
        return formato;
    }

    @Override
    public boolean equals(Object o) {//(4)
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fecha that = (Fecha) o;
        return Objects.equals(formato, that.formato);
    }

    @Override
    public int hashCode() {//(5)
        return Objects.hash(formato);
    }
}
