package co.com.sofka.domain.Generic;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Telefono implements ValueObject<String> {
    private final String telefono;

    public Telefono(String telefono){
        try{
            if(telefono.equals(null) || telefono.length()>50){
                throw new IllegalArgumentException("Datos ingresados incorrectos");
            }else{
                this.telefono=telefono;
            }
        }catch (Exception ex){
            throw new IllegalArgumentException(ex.getMessage());
        }
    }

    @Override
    public String value() {
        return telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefono that = (Telefono) o;
        return Objects.equals(telefono, that.telefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(telefono);
    }
}
