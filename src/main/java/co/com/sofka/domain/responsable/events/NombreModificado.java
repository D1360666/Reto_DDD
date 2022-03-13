package co.com.sofka.domain.responsable.events;

import co.com.sofka.domain.Generic.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreModificado extends DomainEvent {

    private static Nombre nombre;

    public NombreModificado(Nombre nombre ) {
        super("co.com.sofka.responsable.nombremodificado");
        this.nombre = nombre;
    }

    public static Nombre getNombre() {
        return nombre;
    }
}
