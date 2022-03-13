package co.com.sofka.example.coach;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.example.Generic.Nombre;
import co.com.sofka.example.Generic.Telefono;
import co.com.sofka.example.coach.value.CoachId;

public class Coach extends Entity <CoachId> {
    protected Nombre nombre;
    protected Nombre apellido;
    protected Telefono telefono;

    protected Coach(CoachId coachId, Nombre nombre, Nombre apellido, Telefono telefono){
        super(coachId);
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public Coach(CoachId coachId) {
        super(coachId);
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    public Nombre getApellido() {
        return apellido;
    }

    public void setApellido(Nombre apellido) {
        this.apellido = apellido;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    public Nombre getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object o){
        return super.equals(o);
    }

    @Override
    public int hashCode(){
        return super.hashCode();
    }
}

