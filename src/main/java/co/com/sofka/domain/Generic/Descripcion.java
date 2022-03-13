package co.com.sofka.domain.Generic;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Descripcion implements ValueObject<String> {

    private final String descripcion;

    public Descripcion(String descripcion){
        this.descripcion = descripcion;
    }

    @Override
    public String value() {
        return descripcion;
    }

    @Override
    public boolean equals(Object o) {//(4)
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Descripcion that = (Descripcion) o;
        return Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {//(5)
        return Objects.hash(descripcion);
    }
}
