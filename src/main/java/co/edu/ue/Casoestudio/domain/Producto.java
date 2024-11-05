
package co.edu.ue.Casoestudio.domain;

import jakarta.persistence.*;

@Entity
@Table (name = "producto")
public class Producto {
    
    
   @Id
   @Column
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int numero_radicacion;
   @Column
   private String nombre_producto;
   @Column
   private String estado_producto;

    public int getNumero_radicacion() {
        return numero_radicacion;
    }

    public void setNumero_radicacion(int numero_radicacion) {
        this.numero_radicacion = numero_radicacion;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getEstado_producto() {
        return estado_producto;
    }

    public void setEstado_producto(String estado_producto) {
        this.estado_producto = estado_producto;
    }
   
    
}
