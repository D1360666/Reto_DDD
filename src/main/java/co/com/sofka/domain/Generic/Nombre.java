package co.com.sofka.domain.Generic;

import co.com.sofka.domain.actividad.value.TipoActividad;
import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<String> {

    private final String nombre;

    public Nombre(String nombre){
        try{
            if(nombre.equals(null) || nombre.length()>50){
                throw new IllegalArgumentException("Datos ingresados incorrectos");
            }else{
                this.nombre=nombre;
            }
        }catch (Exception ex){
            throw new IllegalArgumentException(ex.getMessage());
        }
    }

    @Override
    public String value() {
        return nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nombre that = (Nombre) o;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
