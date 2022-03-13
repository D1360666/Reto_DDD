package co.com.sofka.domain.actividad.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.Generic.Nombre;

public class ActividadCreada extends DomainEvent {

    private final Nombre nombre;

    public ActividadCreada(Nombre nombre)
    {
        super("co.com.sofka.actividad.actividadcreada");
        this.nombre = nombre;
    }

    public Nombre getNombre(){
        return nombre;
    }

}
