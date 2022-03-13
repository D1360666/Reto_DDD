package co.com.sofka.domain.Generic;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Descripcion implements ValueObject<String> {

    private final String descripcion;

    public Descripcion(String descripcion){
        try{
            if(descripcion.equals(null)){
                throw new IllegalArgumentException("Datos ingresados incorrectos");
            }else{
                this.descripcion=descripcion;
            }
        }catch (Exception ex){
            throw new IllegalArgumentException(ex.getMessage());
        }
    }

    @Override
    public String value() {
        return descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Descripcion that = (Descripcion) o;
        return Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descripcion);
    }
}
