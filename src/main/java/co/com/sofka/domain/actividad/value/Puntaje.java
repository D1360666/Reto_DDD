package co.com.sofka.domain.actividad.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Puntaje implements ValueObject<Integer> {

    private final Integer valor;

    public Puntaje(int valor){
        try{
            if(valor<1){
                throw new IllegalArgumentException("El puntaje debe ser mayor a cero");
            }else{
                this.valor = valor;
            }
        }catch (Exception ex){
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    @Override
    public Integer value() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Puntaje that = (Puntaje) o;
        return Objects.equals(valor, that.valor);
    }

    @Override
    public int hashCode() {//(5)
        return Objects.hash(valor);
    }
}
