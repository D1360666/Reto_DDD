package co.com.sofka.example.actividad;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.example.Generic.Nombre;
import co.com.sofka.example.actividad.events.CoachAsignado;
import co.com.sofka.example.actividad.value.ActividadId;
import co.com.sofka.example.coach.Coach;

public class Actividad extends AggregateEvent<ActividadId> {
    public Actividad(ActividadId entityId) {
        super(entityId);
    }

    public Actividad(ActividadId actividadId, Nombre nombre){
        super(actividadId);
        appendChange(new CoachAsignado(nombre)).apply();
    }
}
