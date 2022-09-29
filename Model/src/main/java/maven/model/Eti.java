package maven.model;


import jakarta.persistence.*;

@Entity  //Indica que es una entidad de la db
@Table(name = "etiqueta") // Indica a que tabla esta haciendo referencia

public class Eti {
	
	@Id
	@Column(name = "ideti")
	private int id;

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
