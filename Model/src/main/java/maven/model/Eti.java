package maven.model;

import javax.persistence.Column;
import javax.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity  //Indica que es una entidad de la db
@Table(name = "eti") // Indica a que tabla esta haciendo referencia

public class Eti{
	
	@Id
	@Column(name = "ideti")
    @SequenceGenerator(name="entA", sequenceName="eti_ideti_seq", allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="entA")
    private Long ideti;
	
	
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

