package maven.model;

import javax.persistence.Column;
import javax.persistence.Table;
import jakarta.persistence.Entity;


@Entity  //Indica que es una entidad de la db
@Table(name = "doc") // Indica a que tabla esta haciendo referencia
public class Doc {
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "fecha")
    private String fecha;

    @Column(name = "emisor")
    private String emisor;


    public Doc(String nombre, String descripcion, String fecha, String emisor) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.emisor = emisor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripción) {
        this.descripcion = descripción;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

}
