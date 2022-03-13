package co.com.sofka.domain.Generic.events;

import co.com.sofka.domain.Generic.Nombre;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.jugador.value.JugadorId;

public class JugadorCreado extends DomainEvent {
    private final JugadorId jugadorId;
    private final Nombre nombre;

    public JugadorCreado(JugadorId id, Nombre nombre)
    {
        super("co.com.sofka.jugador.jugadorcreado");
        this.jugadorId = id;
        this.nombre = nombre;
    }

    public JugadorId getJugadorId() {
        return jugadorId;
    }

    public Nombre getNombre(){
        return nombre;
    }
}
