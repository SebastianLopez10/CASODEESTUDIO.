package co.edu.ue.Casoestudio.domain;

import java.util.List;


public interface ClienteService {
    
      List<Cliente> listar();

    Cliente listarCedula(int cedula);

    Cliente add(Cliente c);

    Cliente edit(Cliente c);

    Cliente delete(int cedula);
    
    
}
