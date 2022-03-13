package co.com.sofka.domain.actividad.events;

import co.com.sofka.domain.actividad.Actividad;
import co.com.sofka.domain.generic.EventChange;

public class ActividadChange extends EventChange {
    public ActividadChange(Actividad actividad) {

        apply((ActividadCreada event) ->{
        });

        apply((CoachAsignado event) ->{

        });

        apply((DescripcionActualizada event) ->{

        });

        apply((JugadoresAsignados event) ->{

        });

        apply((JugadorPuntuado event) ->{

        });

        apply((JugadorQuitado event) ->{

        });


    }
}
