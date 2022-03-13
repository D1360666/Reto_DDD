package co.com.sofka.example.responsable.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.example.Generic.Nombre;
import co.com.sofka.example.Generic.Telefono;
import co.com.sofka.example.jugador.Jugador;
import co.com.sofka.example.responsable.value.ResponsableId;

import java.util.Set;
import java.util.UUID;

public class JugadorAsignado extends DomainEvent {


    public JugadorAsignado(String type, String aggregateRootId, String aggregateParentId, UUID uuid) {
        super(type, aggregateRootId, aggregateParentId, uuid);
    }

    public JugadorAsignado(String type, String aggregateRootId, UUID uuid) {
        super(type, aggregateRootId, uuid);
    }

    public JugadorAsignado(String type, UUID uuid) {
        super(type, uuid);
    }

    public JugadorAsignado(String type) {
        super(type);
    }
}

