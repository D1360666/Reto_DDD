package co.com.sofka.example.responsable;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.example.Generic.Nombre;
import co.com.sofka.example.Generic.Telefono;
import co.com.sofka.example.jugador.Jugador;
import co.com.sofka.example.responsable.events.JugadorAsignado;
import co.com.sofka.example.responsable.events.ResponsableCreado;
import co.com.sofka.example.responsable.value.ResponsableId;

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

    public Responsable(ResponsableId id, String nombre){
        super(id);
        appendChange(new ResponsableCreado(nombre)).apply();
    }

    public void jugadorAsignado(String jugador){
        appendChange(new JugadorAsignado(jugador)).apply();
    }
}
