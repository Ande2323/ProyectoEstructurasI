package co.edu.unbosque.model;

public class Tecnico {

	private String id;
	private String nombre;
	private String especialidad;
	private String zona;
	private boolean estaDisponible;
	
	public Tecnico() {
		// TODO Auto-generated constructor stub
	}

	public Tecnico(String id, String nombre, String especialidad, String zona, boolean estaDisponible) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.zona = zona;
		this.estaDisponible = estaDisponible;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public boolean isEstaDisponible() {
		return estaDisponible;
	}

	public void setEstaDisponible(boolean estaDisponible) {
		this.estaDisponible = estaDisponible;
	}

	@Override
	public String toString() {
		return "Tecnico [id=" + id + ", nombre=" + nombre + ", especialidad=" + especialidad + ", zona=" + zona
				+ ", estaDisponible=" + estaDisponible + "]";
	}
	
	
	
}
