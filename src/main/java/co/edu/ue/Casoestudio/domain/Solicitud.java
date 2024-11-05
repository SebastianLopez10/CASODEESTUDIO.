package co.edu.ue.Casoestudio.domain;


import jakarta.persistence.*;

@Entity
@Table(name = "solicitud")
public class Solicitud {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numero_solicitud;
    @Column
    private String fecha_solicitud;
    @Column
    private String estado;

    public int getNumero_solicitud() {
        return numero_solicitud;
    }

    public void setNumero_solicitud(int numero_solicitud) {
        this.numero_solicitud = numero_solicitud;
    }

    public String getFecha_solicitud() {
        return fecha_solicitud;
    }

    public void setFecha_solicitud(String fecha_solicitud) {
        this.fecha_solicitud = fecha_solicitud;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
