package co.com.sofka.domain.actividad.events;

import co.com.sofka.domain.actividad.Actividad;
import co.com.sofka.domain.actividad.events.ActividadCreada;
import co.com.sofka.domain.actividad.events.JugadoresAsignados;
import co.com.sofka.domain.actividad.events.JugadorPuntuado;
import co.com.sofka.domain.actividad.events.JugadorQuitado;

import co.com.sofka.domain.generic.EventChange;

public class ActividadChange extends EventChange {
    public ActividadChange(Actividad actividad) {

        apply((ActividadCreada event) ->{
            actividad.descripcion = event.getDescripcion();
        });

        apply((CoachAsignado event) ->{
            actividad.coachId = event.getCoachId();
        });

        apply((DescripcionActualizada event) ->{
            if(event.getDescripcion().equals(null)){
                throw new IllegalArgumentException("El valor ingresado es incorrecto");
            }else{
                actividad.descripcion = event.getDescripcion();    
            }
        });

        apply((JugadoresAsignados event) ->{

            actividad.participantes.put(event.getJugadorId1(), event.getPuntaje());
        });

        apply((JugadorPuntuado event) ->{

            actividad.participantes.put(event.getJugadorId(), event.getPuntaje());
        });

        apply((JugadorQuitado event) ->{
            actividad.participantes.remove(event.getJugadorId1(), event.getPuntaje());
        });


    }
}
