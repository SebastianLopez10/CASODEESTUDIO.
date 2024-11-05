package co.edu.ue.Casoestudio.domain;

import jakarta.persistence.*;


@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cedula;
    @Column
    private String nombre;
    @Column 
    private String apellido;
    @Column 
    private String correo;
    @Column 
    private String telefono;
    @Column 
    private String direccion;
    @Column 
    private String estado_crediticio;
    @Column 
    private int s_numero_solicitud;

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado_crediticio() {
        return estado_crediticio;
    }

    public void setEstado_crediticio(String estado_crediticio) {
        this.estado_crediticio = estado_crediticio;
    }

    public int getS_numero_solicitud() {
        return s_numero_solicitud;
    }

    public void setS_numero_solicitud(int s_numero_solicitud) {
        this.s_numero_solicitud = s_numero_solicitud;
    }

                    
    
    
}
