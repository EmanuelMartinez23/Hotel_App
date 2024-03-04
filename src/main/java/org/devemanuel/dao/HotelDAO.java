package org.devemanuel.dao;

import org.devemanuel.model.Hotel;

import java.util.List;

public interface HotelDAO {
    List<Hotel>listarHoteles();
    Hotel conseguirHotelPorID(int id);
    boolean eliminarHotel(int id);
    boolean agregarHotel(Hotel hotel);
    boolean actualizarHotel(Hotel hotel);
}
