package org.devemanuel.model;

public class Cliente {
    // atributos
    private String nombre;
    private String email;
    private String telefono;
    private int cliente_id;

    // contructor
    public Cliente(){

    }
    public Cliente(String nombre, String email, String telefono, int cliente_id){
        this.cliente_id = cliente_id;
        this.nombre =  nombre;
        this.email = email;
        this.telefono = telefono;
    }

    // metodo getter and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

}
