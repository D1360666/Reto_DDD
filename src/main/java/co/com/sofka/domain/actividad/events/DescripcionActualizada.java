package co.com.sofka.domain.actividad.events;

import co.com.sofka.domain.Generic.Descripcion;
import co.com.sofka.domain.generic.DomainEvent;

public class DescripcionActualizada extends DomainEvent {

    private final Descripcion descripcion;

    public DescripcionActualizada(Descripcion descripcion) {
        super("co.com.sofka.actividad.descripcionactualizaca");
        this.descripcion=descripcion;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
