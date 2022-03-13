package co.com.sofka.domain.actividad.events;

import co.com.sofka.domain.coach.Coach;
import co.com.sofka.domain.coach.value.CoachId;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.Generic.Nombre;

public class CoachAsignado extends DomainEvent {
    private final CoachId coachId;

    public CoachAsignado(CoachId coachId) {
        super("co.com.sofka.actividad.coachasignado");
        this.coachId = coachId;
    }

    public CoachId getCoachId(){
        return coachId;
    }

}
