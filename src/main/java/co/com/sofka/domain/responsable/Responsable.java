package co.com.sofka.domain.responsable;

import co.com.sofka.domain.Generic.Nombre;
import co.com.sofka.domain.Generic.Telefono;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.jugador.value.JugadorId;
import co.com.sofka.domain.responsable.events.JugadorAsignado;
import co.com.sofka.domain.responsable.events.NombreModificado;
import co.com.sofka.domain.responsable.events.ResponsableCreado;
import co.com.sofka.domain.responsable.value.ResponsableId;
import co.com.sofka.domain.jugador.Jugador;

import java.util.Set;

public class Responsable extends AggregateEvent<ResponsableId> {

    protected Nombre nombre;
    protected Nombre apellido;
    protected Telefono telefono;
    protected Set<Jugador> jugadores;


    public Responsable(ResponsableId responsableId, Nombre nombre, Nombre apellido, Telefono telefono) {
        super(responsableId);
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public Responsable(ResponsableId responsableId, Nombre nombre){
        super(responsableId);
        appendChange(new ResponsableCreado(nombre)).apply();
    }

    public void jugadorAsignado(ResponsableId responsableId, JugadorId jugadorId){
        appendChange(new JugadorAsignado(responsableId, jugadorId)).apply();
    }

    public void modificarNombre(Nombre nombre){
        appendChange(new NombreModificado(nombre)).apply();
    }
}
