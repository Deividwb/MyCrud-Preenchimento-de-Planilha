package br.com.dwb.dao;

import br.com.dwb.model.Ciudad;
import br.com.dwb.model.Relleno_Planillas;

import java.util.List;
import java.util.Optional;

public interface IRellenoDAO {

    Relleno_Planillas save(Relleno_Planillas relleno_planillas);
    Relleno_Planillas actualizar(Relleno_Planillas relleno_planillas);
    void delete(Long id);
    List<Relleno_Planillas>findAll();
    Optional<Relleno_Planillas>findById(Long id);
    List<Relleno_Planillas>FindByCiudad(Ciudad ciudad);
}
