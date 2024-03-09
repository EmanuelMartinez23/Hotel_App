package org.devemanuel.dao;

import org.devemanuel.model.Cliente;
import org.devemanuel.util.DataBaseUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/*
Clase que va a tener la logica para los metodos de los clientes
 */
public class ClienteDAOImpl implements ClienteDAO{
    @Override
    public List<Cliente> listarCliente() {
        // Creamos una lista donde vamos a almacenar los clientes
        List<Cliente> listaClientes = new ArrayList<>();

        // conseguimos una conexion hacia la base de datos
        try (Connection connection = DataBaseUtil.getconnection()) {
            // consulta SQL
            String sql = "SELECT * FROM cliente";
            // creamos una declaración con un tipo de resulset con scroll y que no se pueda modificar solo leer
            try (
                    Statement sts = connection.createStatement(
                            ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY)
            ) {
                // ejecutamos la query y obtenemos los resultados
                try (ResultSet resultSet = sts.executeQuery(sql)) {
                    // iteramos sobre el resultSet
                    while (resultSet.next()){
                        // obtenemos el nombre
                        String nombre =  resultSet.getString("nombre");
                        String email =  resultSet.getString("email");
                        String telefono =  resultSet.getString("telefono");
                        int cliente_id =  resultSet.getInt("cliente_id");
                        // vamos a agregar a la lista
                        listaClientes.add(new Cliente(nombre,email,telefono,cliente_id));
                    }

                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return listaClientes;
    }

    @Override
    public boolean eliminarCliente(int id) {
        // variable que almacenara el resultado de la operación
        int f = 0;

        // conseguimos una conexion hacia la base de datos
        try (Connection connection = DataBaseUtil.getconnection()) {
            // consulta SQL para borrar un cliente por su ID
            String sql = "DELETE FROM cliente WHERE cliente_id = ?";
            // creamos una declaración prepqrada con un tipo de resulset con scroll y que no se pueda modificar solo leer
            try (
                    PreparedStatement ps = connection.prepareStatement(
                            sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY) ){
                // pasamos el parametro de la declaración preparada
                ps.setInt(1,id);
                // ejecutamos la query y obtenemos si se borro correctamente
                f = ps.executeUpdate();
                // retorna falso si es diferente a 1, que 1 regresaria executeUpdate() si borro
                return f == 1;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        // variable que almacenara el resultado de la operación
        int f = 0;
        // conseguimos una conexion hacia la base de datos
        try (Connection connection = DataBaseUtil.getconnection()) {
            // consulta SQL para agregar  un cliente
            String sql = "INSERT INTO cliente(cliente_id, nombre, email, telefono) VALUES (?,?,?,?)";
            // creamos una declaración prepqrada con un tipo de resulset con scroll y que no se pueda modificar solo leer
            try (
                    PreparedStatement ps = connection.prepareStatement(
                            sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY) ){
                // pasamos el parametro de la declaración preparada
                ps.setInt(1,cliente.getCliente_id());
                ps.setString(2,cliente.getNombre());
                ps.setString(3,cliente.getEmail());
                ps.setString(4,cliente.getTelefono());

                // ejecutamos la query y obtenemos si se agrego correctamente
                f = ps.executeUpdate();
                // retorna falso si es diferente a 1, que 1 regresaria executeUpdate() si agrego correctamente
                return f == 1;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
