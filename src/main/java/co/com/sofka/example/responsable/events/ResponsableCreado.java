package co.com.sofka.example.responsable.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.example.Generic.Nombre;

import java.util.UUID;

public class ResponsableCreado extends DomainEvent {


    public ResponsableCreado(String type) {
        super(type);
    }
}
