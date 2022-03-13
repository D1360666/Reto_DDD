package co.com.sofka.domain.actividad.events;

import co.com.sofka.domain.actividad.value.Puntaje;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.jugador.value.JugadorId;

public class JugadorPuntuado extends DomainEvent {

    private final JugadorId jugadorId;
    private final Puntaje puntaje;
    public JugadorPuntuado(JugadorId jugadorId, Puntaje puntaje) {

        super("co.com.sofka.actividad.jugadorpuntuado");
        this.jugadorId = jugadorId;
        this.puntaje = puntaje;
    }

    public JugadorId getJugadorId() {
        return jugadorId;
    }

    public Puntaje getPuntaje() {
        return puntaje;
    }
}
