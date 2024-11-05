package co.edu.ue.Casoestudio.Infraestructura;

import co.edu.ue.Casoestudio.domain.Cliente;
import co.edu.ue.Casoestudio.domain.ClienteService;
import co.edu.ue.Casoestudio.domain.Producto;
import co.edu.ue.Casoestudio.domain.ProductoService;
import co.edu.ue.Casoestudio.domain.Solicitud;
import co.edu.ue.Casoestudio.domain.SolicitudService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/casodeestudio"})
public class CasoestudioRest {
    
 @Autowired 
 ClienteService cservice;
 ProductoService pservice;
 SolicitudService sservice;
 
 
 //Cliente
@GetMapping("/Cliente")
    public List<Cliente> listar() {
        return cservice.listar();
    }

    @PostMapping("/Cliente/nuevo")
    public Cliente agregar(@RequestBody Cliente  c) {
        return cservice.add(c);
    }

    @GetMapping("/Cliente/{cedula}")
    public Cliente listarId(@PathVariable("cedula") int cedula) {
        return cservice.listarCedula(cedula);
    }

    @PutMapping("/Cliente/{cedula}")
    public Cliente editar(@RequestBody Cliente c, @PathVariable("cedula") int cedula) {
        c.setCedula(cedula);   
        return cservice.edit(c);
    }
    
    @DeleteMapping("/Cliente/{cedula}")
    public Cliente delete(@PathVariable("cedula") int cedula) {
        return cservice.delete(cedula);
    }
    
    
// producto
    @GetMapping("/producto")
    public List<Producto> listarradicacion() {
        return pservice.listar();
    }

    @PostMapping("/producto/nuevo")
    public Producto agregar(@RequestBody Producto p) {
        return pservice.add(p);
    }

    @GetMapping("/producto/{numero_radicacion}")
    public Producto listarradicacion(@PathVariable("numero_radicacion") int numero_radicacion) {
        return pservice.listarradicacion(numero_radicacion);
    }

    @PutMapping("/producto/{numero_radicacion}")
    public Producto editar(@RequestBody Producto p, @PathVariable("numero_radicacion") int numero_radicacion) {
        p.setNumero_radicacion(numero_radicacion);   
        return pservice.edit(p);
    }
    
    @DeleteMapping("/producto/{numero_radicacion}")
    public Producto deletep(@PathVariable("numero_radicacion") int numero_radicacion) {
        return pservice.delete(numero_radicacion);
    }
// Solicitud
    @GetMapping("/solicitud")
    public List<Solicitud> listarsolicitud() {
        return sservice.listar();
    }

    @PostMapping("/solicitud/nuevo")
    public Solicitud agregar(@RequestBody Solicitud s) {
        return sservice.add(s);
    }

    @GetMapping("/solicitud/{numero_radicacion}")
    public Solicitud listarsolicitud(@PathVariable("numero_solicitud") int numero_solicitud) {
        return sservice.listarsolicitud(numero_solicitud);
    }

    @PutMapping("/solicitud/{numero_radicacion}")
    public Solicitud editar(@RequestBody Solicitud s, @PathVariable("numero_solicitud") int numero_solicitud) {
        s.setNumero_solicitud(numero_solicitud);   
        return sservice.edit(s);
    }
    
    @DeleteMapping("/solicitud/{numero_solicitud}")
    public Solicitud deleteS(@PathVariable("numero_solicitud") int numero_solicitud) {
        return sservice.delete(numero_solicitud);
    }
    
}
