package co.edu.unbosque.model;

public class Kit {

	private String id;
	private String nombre;
	private String descripcion;
	private boolean enRevision;
	private String fechaUltimoUso;
	private ListaEnlazada<String> elementosFaltantes;
	private boolean requiereReparacion;
	
	public Kit() {
		// TODO Auto-generated constructor stub
	}

	public Kit(String id, String nombre, String descripcion, boolean enRevision, String fechaUltimoUso,
			ListaEnlazada<String> elementosFaltantes, boolean requiereReparacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.enRevision = enRevision;
		this.fechaUltimoUso = fechaUltimoUso;
		this.elementosFaltantes = elementosFaltantes;
		this.requiereReparacion = requiereReparacion;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isEnRevision() {
		return enRevision;
	}

	public void setEnRevision(boolean enRevision) {
		this.enRevision = enRevision;
	}

	public String getFechaUltimoUso() {
		return fechaUltimoUso;
	}

	public void setFechaUltimoUso(String fechaUltimoUso) {
		this.fechaUltimoUso = fechaUltimoUso;
	}

	public ListaEnlazada<String> getElementosFaltantes() {
		return elementosFaltantes;
	}

	public void setElementosFaltantes(ListaEnlazada<String> elementosFaltantes) {
		this.elementosFaltantes = elementosFaltantes;
	}

	public boolean isRequiereReparacion() {
		return requiereReparacion;
	}

	public void setRequiereReparacion(boolean requiereReparacion) {
		this.requiereReparacion = requiereReparacion;
	}

	@Override
	public String toString() {
		return "Kit [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", enRevision=" + enRevision
				+ ", fechaUltimoUso=" + fechaUltimoUso + ", elementosFaltantes=" + elementosFaltantes
				+ ", requiereReparacion=" + requiereReparacion + "]";
	}
	

}
