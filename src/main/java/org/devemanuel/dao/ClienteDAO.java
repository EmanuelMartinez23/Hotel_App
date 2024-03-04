package org.devemanuel.dao;

import org.devemanuel.model.Cliente;

import java.util.List;

public interface ClienteDAO {
    List<Cliente> listarCliente();
    boolean eliminarCliente(int id);
    boolean agregarCliente(Cliente h);

}
