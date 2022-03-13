package co.com.sofka.domain.responsable.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.jugador.value.JugadorId;
import co.com.sofka.domain.responsable.Responsable;
import co.com.sofka.domain.responsable.value.ResponsableId;

import java.util.UUID;

public class JugadorAsignado extends DomainEvent {

    private final ResponsableId responsable;
    private final JugadorId jugadorId;

    public JugadorAsignado(ResponsableId responsableId, JugadorId jugadorId) {

        super("co.com.sofka.responsable.jugadorasociado");
        this.responsable = responsableId;
        this.jugadorId  = jugadorId;

    }

    public ResponsableId getResponsable() {
        return responsable;
    }

    public JugadorId getJugadorId() {
        return jugadorId;
    }
}

