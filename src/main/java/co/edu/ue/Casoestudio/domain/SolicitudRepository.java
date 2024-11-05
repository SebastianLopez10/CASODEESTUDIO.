package co.edu.ue.Casoestudio.domain;

import java.util.List;
import org.springframework.data.repository.Repository;


public interface SolicitudRepository extends Repository<Solicitud, Integer>{
    
    List<Solicitud> findAll();

    Solicitud findById(int numero_solicitud);

    Solicitud save(Solicitud s);

    void delete(Solicitud s);
    
}
