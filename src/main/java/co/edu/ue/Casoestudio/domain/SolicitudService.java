
package co.edu.ue.Casoestudio.domain;

import java.util.List;


public interface SolicitudService {
    List<Solicitud> listar();

    Solicitud listarsolicitud(int numero_solicitud);

    Solicitud add(Solicitud s);

    Solicitud edit(Solicitud s);

    Solicitud delete(int numero_solicitud);
    
    
}
