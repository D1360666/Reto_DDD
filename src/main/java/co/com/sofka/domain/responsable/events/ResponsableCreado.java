package co.com.sofka.domain.responsable.events;

import co.com.sofka.domain.Generic.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class ResponsableCreado extends DomainEvent {

    private final Nombre nombre;

    public ResponsableCreado(Nombre nombre) {
        super("co.com.sofka.responsable.responsablecreado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
