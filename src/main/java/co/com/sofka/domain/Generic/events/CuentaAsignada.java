package co.com.sofka.domain.Generic.events;

import co.com.sofka.domain.cuenta.value.CuentaId;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.jugador.value.JugadorId;

public class CuentaAsignada extends DomainEvent {

    private final JugadorId jugadorId;
    private final CuentaId cuentaId;

    public CuentaAsignada(JugadorId jugadorId, CuentaId cuentaId) {
        super("co.com.sofka.jugador.cuentaasignada");
        this.jugadorId = jugadorId;
        this.cuentaId = cuentaId;
    }

    public JugadorId getJugadorId() {
        return jugadorId;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }
}
