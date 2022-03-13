package co.com.sofka.example.jugador;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.example.jugador.value.JugadorId;

public class Jugador extends AggregateEvent<JugadorId> {
    public Jugador(JugadorId entityId) {
        super(entityId);
    }
}
