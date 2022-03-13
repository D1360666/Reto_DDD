package co.com.sofka.domain.actividad.events;

import co.com.sofka.domain.actividad.value.ActividadId;
import co.com.sofka.domain.actividad.value.Puntaje;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.jugador.value.JugadorId;

public class JugadorQuitado extends DomainEvent {
    private final Puntaje puntaje;
    private final JugadorId jugadorId1;

    public JugadorQuitado(Puntaje puntaje, JugadorId jugadorId) {

        super("co.com.sofka.actividad.jugadorquitado");
        this.puntaje = puntaje;
        this.jugadorId1 = jugadorId;
    }

    public Puntaje getPuntaje() {
        return puntaje;
    }

    public JugadorId getJugadorId1() {
        return jugadorId1;
    }
}
