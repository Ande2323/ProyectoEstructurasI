package co.edu.unbosque.model;

import java.util.UUID;

public class UnidadServicio {

	private UUID id;
	private String tipo;
	private String zona;
	private boolean estaDisponible;
	
	public UnidadServicio() {
		// TODO Auto-generated constructor stub
	}

	public UnidadServicio(UUID id, String tipo, String zona, boolean estaDisponible) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.zona = zona;
		this.estaDisponible = estaDisponible;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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
		return "UnidadServicio [id=" + id + ", tipo=" + tipo + ", zona=" + zona + ", estaDisponible=" + estaDisponible
				+ "]";
	}
	
	
	
}
