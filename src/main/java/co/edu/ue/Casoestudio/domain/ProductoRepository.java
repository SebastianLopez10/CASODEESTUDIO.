
package co.edu.ue.Casoestudio.domain;

import java.util.List;
import org.springframework.data.repository.Repository;


public interface ProductoRepository  extends Repository<Producto, Integer> {
  
    
    List<Producto> findAll();

    Producto findById(int numero_radicacion);

    Producto save(Producto p);

    void delete(Producto p);
}
