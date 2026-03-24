package co.edu.unbosque.model;

public class Cliente {

	private String nombre;
	private String tipoCliente;
	private String contacto;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nombre, String tipoCliente, String contacto) {
		super();
		this.nombre = nombre;
		this.tipoCliente = tipoCliente;
		this.contacto = contacto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", tipoCliente=" + tipoCliente + ", contacto=" + contacto + "]";
	}
	
	
}
