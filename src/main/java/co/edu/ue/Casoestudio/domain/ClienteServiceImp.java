package co.edu.ue.Casoestudio.domain;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImp implements ClienteService {
    
    @Autowired
    private ClienteRepositorio repository;
    
    
    @Override
    public List<Cliente> listar() {
        return repository.findAll();
    }

    @Override
    public Cliente listarCedula(int cedula) {
        return repository.findById(cedula);
    }

    @Override
    public Cliente add(Cliente c) {
        return repository.save(c);
    }
    
    @Override
    public Cliente edit(Cliente c) {
        return repository.save(c);
    }
    
    @Override
    public Cliente delete(int cedula) {
        Cliente cliente = repository.findById(cedula);
        if (cliente != null) {
            repository.delete(cliente);
        }
        return cliente;
    }
}

