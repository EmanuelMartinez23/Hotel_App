package org.devemanuel.dao;

import org.devemanuel.model.Cliente;

import java.util.List;
/*
Clase que va a tener la logica para los metodos de los clientes
 */
public class ClienteDAOImpl implements ClienteDAO{
    @Override
    public List<Cliente> listarCliente() {
        return null;
    }

    @Override
    public boolean eliminarCliente(int id) {
        return false;
    }

    @Override
    public boolean agregarCliente(Cliente h) {
        return false;
    }
}
