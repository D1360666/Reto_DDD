package co.com.sofka.domain.cuenta.events;

import co.com.sofka.domain.Generic.Descripcion;
import co.com.sofka.domain.generic.DomainEvent;

public class DescripcionCambiada extends DomainEvent {

    private final Descripcion descripcion;

    public DescripcionCambiada(Descripcion descripcion) {
        super("co.com.sofka.cuenta.descripcioncambiada");
        this.descripcion = descripcion;
    }


    public Descripcion getDescripcion() {
        return descripcion;
    }
}
