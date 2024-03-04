package org.devemanuel.model;

public class Hotel {
    // atributos
    private String nombre;
    private String ubicacion;
    private float puntaje;
    private int hotel_id;

    // contructores
    public Hotel(){

    }

    public Hotel(String nombre, String ubicacion, float puntaje, int hotel_id) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.puntaje = puntaje;
        this.hotel_id = hotel_id;
    }

    // metodos setter and getter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public float getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(float puntaje) {
        this.puntaje = puntaje;
    }

    public int getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }

}
