package maven.model;

import javax.persistence.Column;
import javax.persistence.Table;
import jakarta.persistence.Entity;


@Entity  //Indica que es una entidad de la db
@Table(name = "etiqueta") // Indica a que tabla esta haciendo referencia

public class Eti {
	@Column(name = "nombre")
    private String nombre;

	@Column(name = "descripcion")
	private String descripcion;

	public Eti(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
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

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
