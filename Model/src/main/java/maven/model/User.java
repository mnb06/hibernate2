package maven.model;

import jakarta.persistence.*;


@Entity  //Indica que es una entidad de la db
@Table(name = "users") // Indica a que tabla esta haciendo referencia

public class User {

	@Id
	@Column(name = "iduser")
	private int id;

	@Column(name = "nombre")
    private String nombre;

	@Column(name = "apellido")
	private String apellido;

	@Column(name = "correo")
	private String correo;
	
	@Column(name = "puesto")
	private String puesto;
	

	public User(String nombre, String apellido, String correo, String puesto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.puesto = puesto;
    }

    @Override
	public String toString() {
		return "User [apellido=" + apellido + ", correo=" + correo + ", nombre=" + nombre + ", puesto=" + puesto + "]";
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

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
    
}
