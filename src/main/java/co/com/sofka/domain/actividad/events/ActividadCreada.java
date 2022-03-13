package co.com.sofka.domain.actividad.events;

import co.com.sofka.domain.Generic.Descripcion;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.Generic.Nombre;

public class ActividadCreada extends DomainEvent {

    private final Descripcion descripcion;

    public ActividadCreada(Descripcion descripcion)
    {
        super("co.com.sofka.actividad.actividadcreada");
        this.descripcion = descripcion;
    }

    public Descripcion getDescripcion(){
        return descripcion;
    }

}
