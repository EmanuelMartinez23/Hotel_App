package org.devemanuel;


import org.devemanuel.dao.ClienteDAOImpl;
import org.devemanuel.model.Cliente;
import org.devemanuel.util.DataBaseUtil;
import org.devemanuel.util.DataSource;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ClienteDAOImpl clienteDAO = new ClienteDAOImpl();
//        List<Cliente> clientes = clienteDAO.listarCliente();
//        for (Cliente c : clientes) {
//            System.out.println(c.getCliente_id());
//            System.out.println(c.getNombre());
//            System.out.println(c.getEmail());
//            System.out.println(c.getTelefono());
//        }
//
//        boolean b = clienteDAO.eliminarCliente(4);
//        if (b){
//            System.out.println("Se eleminimo el cliente correctamente");
//
//        }

        boolean obama = clienteDAO.agregarCliente(new Cliente("Obama", "usa.gov.us.com", "32456780", 4));
        System.out.println(obama);
    }
}