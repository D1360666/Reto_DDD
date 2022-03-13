package co.com.sofka.domain.cuenta;

import co.com.sofka.domain.Generic.Fecha;
import co.com.sofka.domain.cuenta.value.CuentaId;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.Generic.Descripcion;

import java.util.Objects;

public class Cuenta extends Entity<CuentaId> {

    private CuentaId cuentaId;
    private Descripcion descripcion;
    private Fecha fecha;

    public Cuenta(CuentaId entityId, Descripcion descripcion, Fecha fecha) {
        super(entityId);
        this.cuentaId=entityId;
        this.descripcion=descripcion;
        this.fecha = fecha;

    }


    public void actualizarDescripcion(Descripcion descripcion){
        this.descripcion = Objects.requireNonNull(descripcion);
    }

    public Descripcion descripcion(){
        return descripcion;
    }

    public Fecha fecha(){
        return fecha;
    }
}
