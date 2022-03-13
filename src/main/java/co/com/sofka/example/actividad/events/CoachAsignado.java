package co.com.sofka.example.actividad.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.example.Generic.Nombre;

import java.util.UUID;

public class CoachAsignado extends DomainEvent {
    private final Nombre nombre;

    public CoachAsignado(Nombre nombre) {
        super("sofka.coach.coachasignado");
        this.nombre = nombre;
    }

    public Nombre getNombre(){
        return nombre;
    }
}
