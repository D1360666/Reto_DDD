package co.com.sofka.domain.Generic.events;

import co.com.sofka.domain.generic.DomainEvent;

public class NombreActualizado extends DomainEvent {
    public NombreActualizado() {
        super("co.com.sofka.jugador.nombreactualizado");
    }
}
