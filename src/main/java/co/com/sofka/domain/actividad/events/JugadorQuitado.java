package co.com.sofka.domain.actividad.events;

import co.com.sofka.domain.actividad.value.ActividadId;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.jugador.value.JugadorId;

public class JugadorQuitado extends DomainEvent {
    private final ActividadId actividadId1;
    private final JugadorId jugadorId1;

    public JugadorQuitado(ActividadId actividadId, JugadorId jugadorId) {

        super("co.com.sofka.actividad.jugadorquitado");
        this.actividadId1 = actividadId;
        this.jugadorId1 = jugadorId;
    }

    public ActividadId getActividadId1() {
        return actividadId1;
    }

    public JugadorId getJugadorId1() {
        return jugadorId1;
    }
}
