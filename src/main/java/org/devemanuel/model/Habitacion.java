package org.devemanuel.model;

public class Habitacion {
    // atributos
    private int numero;
    private String tipo;
    private int capacidad;
    private float precioPorNoche;
    private int hotel_id;
    private int cliente_id;

    // constructores
    public Habitacion(int numero, String tipo, int capacidad, float precioPorNoche, int hotel_id, int cliente_id) {
        this.numero = numero;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.precioPorNoche = precioPorNoche;
        this.hotel_id = hotel_id;
        this.cliente_id = cliente_id;
    }

    public Habitacion(){

    }

    //  metodos getter y setter

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public float getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(float precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public int getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }
}
