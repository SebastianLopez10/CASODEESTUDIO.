
package co.edu.ue.Casoestudio.domain;

import java.util.List;


public interface ProductoService {
    
      List<Producto> listar();

    Producto listarradicacion(int numero_radicacion);

    Producto add(Producto p);

    Producto edit(Producto p);

    Producto delete(int numero_radicacion);
    
    
}
