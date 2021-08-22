package br.com.dwb.dao;

import br.com.dwb.infra.ConnectionFactory;
import br.com.dwb.model.Ciudad;
import br.com.dwb.model.Relleno_Planillas;

import java.sql.*;
import java.util.List;
import java.util.Optional;

public class ConexaoDAO implements IRellenoDAO{
    @Override
    public Relleno_Planillas save(Relleno_Planillas relleno_planillas) {
        try (Connection connection = ConnectionFactory.getConnection()) {
            String sql = "INSERT INTO relleno_planillas(nombre,telefono,direccion,ciudad,status) VALUES(?,?,?,?,?)";

            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, relleno_planillas.getNombre());
            preparedStatement.setString(2, relleno_planillas.getTelefono());
            preparedStatement.setString(3, relleno_planillas.getDireccion());
            preparedStatement.setString(4, relleno_planillas.getCiudad().toString().toUpperCase());
            preparedStatement.setString(5, relleno_planillas.getStatus());

            preparedStatement.executeUpdate();

            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            resultSet.next();

            //nao esta pegando meu numero de id.
            Long generatedId = resultSet.getLong(1);
            relleno_planillas.setId(generatedId);

        } catch (
                SQLException ex) {
            throw new RuntimeException(ex);
        }
        return relleno_planillas;
    }

    @Override
    public Relleno_Planillas actualizar(Relleno_Planillas relleno_planillas) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Relleno_Planillas> findAll() {

        return null;
    }

    @Override
    public Optional<Relleno_Planillas> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Relleno_Planillas> FindByCiudad(Ciudad ciudad) {
        return null;
    }
}

