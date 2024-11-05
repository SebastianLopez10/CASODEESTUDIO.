
package co.edu.ue.Casoestudio.domain;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImp implements ProductoService{
    
    @Autowired
    private ProductoRepository repositorio;
    
     @Override
    public List<Producto> listar() {
        return repositorio.findAll();
    }

    @Override
    public Producto listarradicacion(int numero_radicacion) {
        return repositorio.findById(numero_radicacion);
    }

    @Override
    public Producto add(Producto p) {
        return repositorio.save(p);
    }
    
    @Override
    public Producto edit(Producto p) {
        return repositorio.save(p);
    }
    
    @Override
    public Producto delete(int numero_radicacion) {
        Producto producto = repositorio.findById(numero_radicacion);
        if (producto != null) {
            repositorio.delete(producto);
        }
        return producto;
    }
    
    
    
    
    
}
