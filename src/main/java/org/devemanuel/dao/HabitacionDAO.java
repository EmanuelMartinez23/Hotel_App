package org.devemanuel.dao;

import org.devemanuel.model.Habitacion;

import java.util.List;

public interface HabitacionDAO {
    List<Habitacion> listarHabitaciones();
    Habitacion obtenerHabitacionPorID(int id);
    boolean eliminarHabitacion(int id);
    boolean agregarHabitacion(Habitacion h);
    boolean actualizarHabitacion(Habitacion h);
}
