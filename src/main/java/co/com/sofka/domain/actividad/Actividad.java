package co.com.sofka.domain.actividad;

import co.com.sofka.domain.actividad.events.*;
import co.com.sofka.domain.actividad.value.ActividadId;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.Generic.Descripcion;
import co.com.sofka.domain.Generic.Fecha;
import co.com.sofka.domain.Generic.Nombre;
import co.com.sofka.domain.actividad.value.Puntaje;
import co.com.sofka.domain.actividad.value.TipoActividad;
import co.com.sofka.domain.coach.value.CoachId;
import co.com.sofka.domain.jugador.value.JugadorId;

import java.util.Map;

public class Actividad extends AggregateEvent<ActividadId> {

    public CoachId coachId;
    public Map<JugadorId, Puntaje> participantes;
    protected Fecha fecha;
    protected TipoActividad tipoActividad;
    public Descripcion descripcion;
    protected Puntaje puntaje;


    public Actividad(ActividadId actividadId, Descripcion descripcion){
        super(actividadId);
        appendChange(new ActividadCreada(descripcion)).apply();
    }

    private Actividad(ActividadId actividadId){
        super(actividadId);
        subscribe(new ActividadChange(this));

    }

    public void asociarCoach(CoachId coachId){
        appendChange(new CoachAsignado(coachId)).apply();
    }

    public void agregarJugador(Puntaje puntaje, JugadorId jugadorId){
        appendChange(new JugadoresAsignados(jugadorId,puntaje)).apply();
    }

    public void quitarJugador(Puntaje puntaje, JugadorId jugadorId){
        appendChange(new JugadorQuitado(puntaje, jugadorId)).apply();
    }

    public void actualizarDescripcion(Descripcion descripcion){
        appendChange(new DescripcionActualizada(descripcion)).apply();
    }

    public void puntuarJugador(JugadorId id, Puntaje puntaje){
        appendChange(new JugadorPuntuado(id, puntaje)).apply();
    }

}
