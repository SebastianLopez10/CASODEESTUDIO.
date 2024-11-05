
package co.edu.ue.Casoestudio.domain;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


public class SolicitudServiceImp implements SolicitudService{
    @Autowired
    private SolicitudRepository srepository;
    
    @Override
    public List<Solicitud> listar() {
        return srepository.findAll();    }

    @Override
    public Solicitud listarsolicitud(int numero_solicitud) {
        return srepository.findById(numero_solicitud);    }

    @Override
    public Solicitud add(Solicitud s) {
        return srepository.save(s);    }

    @Override
    public Solicitud edit(Solicitud s) {
        return srepository.save(s);
    }

    @Override
    public Solicitud delete(int numero_solicitud) {
        Solicitud solicitud = srepository.findById(numero_solicitud);
        if (solicitud != null) {
            srepository.delete(solicitud);
        }
        return solicitud;    }
    
}
