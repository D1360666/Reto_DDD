package co.com.sofka.domain.actividad.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoActividad implements ValueObject<String> {

    private final String tipo;

    public TipoActividad(String tipo){
        try{
            if(tipo.equals(null)){
                throw new IllegalArgumentException("Datos ingresados incorrectos");
            }else{
                this.tipo=tipo;
            }
        }catch (Exception ex){
            throw new IllegalArgumentException(ex.getMessage());
        }
    }

    @Override
    public String value() {
        return tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoActividad that = (TipoActividad) o;
        return Objects.equals(tipo, that.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo);
    }
}
