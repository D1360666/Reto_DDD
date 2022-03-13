package co.com.sofka.domain.Generic.events;

import co.com.sofka.domain.Generic.Fecha;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.jugador.value.JugadorId;

public class FichaMedicaActualizada extends DomainEvent {

    private final JugadorId jugadorId;
    private final Fecha fecha;


    public FichaMedicaActualizada(JugadorId id, Fecha fecha) {

        super("co.com.sofka.jugador.fichamedicaactualizada");
        this.jugadorId = id;
        this.fecha = fecha;
    }

    public JugadorId getJugadorId() {
        return jugadorId;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
