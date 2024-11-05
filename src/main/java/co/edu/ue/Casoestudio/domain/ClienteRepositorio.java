package co.edu.ue.Casoestudio.domain;

import java.util.List;
import org.springframework.data.repository.Repository;


public interface ClienteRepositorio extends Repository<Cliente, Integer> {
    
    List<Cliente> findAll();

    Cliente findById(int Cedula);

    Cliente save(Cliente c);

    void delete(Cliente c);
}
