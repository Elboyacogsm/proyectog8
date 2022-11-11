package com.pcgsmenabled.app.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyJoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="departamentos")
public class Departamento {
	@Id
	@Column (length=5, nullable = false)
	private String id;
	@Column (length=50, nullable = false)
	private String nombre;
	@Column (name = "idPaisDepFk", length=50, nullable = false)
	private String ipPaisDepFk;
	@ManyToOne
	@MapKeyJoinColumn (name = "idPaisDepFk", insertable = false, updatable = false)
	private Pais pais;
	
	@OneToMany(mappedBy="departamento")
	private List<Ciudad> ciudades;

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

	public String getIpPaisDepFk() {
		return ipPaisDepFk;
	}

	public void setIpPaisDepFk(String ipPaisDepFk) {
		this.ipPaisDepFk = ipPaisDepFk;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public List<Ciudad> getCiudades() {
		return ciudades;
	}

	public void setCiudades(List<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}
	
	

	
}
