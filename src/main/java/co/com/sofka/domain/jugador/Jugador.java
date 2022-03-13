package co.com.sofka.domain.jugador;

import co.com.sofka.domain.Generic.Fecha;
import co.com.sofka.domain.Generic.Nombre;
import co.com.sofka.domain.cuenta.value.CuentaId;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.Generic.events.CuentaAsignada;
import co.com.sofka.domain.Generic.events.FichaMedicaActualizada;
import co.com.sofka.domain.Generic.events.JugadorCreado;
import co.com.sofka.domain.jugador.value.JugadorId;
import co.com.sofka.domain.responsable.value.ResponsableId;

public class Jugador extends AggregateEvent<JugadorId> {
    protected Nombre nombre;
    protected Nombre apellido;
    protected ResponsableId responsableId;
    protected Fecha fichaMedica;
    protected CuentaId cuentaId;

    public Jugador(JugadorId entityId, Nombre nombre) {

        super(entityId);
        appendChange(new JugadorCreado(entityId, nombre)).apply();
    }

    public void actualizaFichaMedica(JugadorId id, Fecha fecha){
        appendChange(new FichaMedicaActualizada(id, fecha)).apply();
    }

    public void asignarCuenta(JugadorId id, CuentaId cuentaId){
        appendChange(new CuentaAsignada(id, cuentaId)).apply();
    }
}
