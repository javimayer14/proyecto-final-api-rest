package com.unaj.proyectofinal.backend.apirest.models.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "cambio_laboral")
public class CambioCondiciones implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCambioCondicion;
	private String motivoPrincipal;
	private String subMotivo;
	private String descripcion;
	private Date fecha;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_delegado")
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private Delegado delegado;

	
	public Delegado getDelegado() {
		return delegado;
	}

	public void setDelegado(Delegado delegado) {
		this.delegado = delegado;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public long getIdCambioCondicion() {
		return idCambioCondicion;
	}

	public void setIdCambioCondicion(long idCambioCondicion) {
		this.idCambioCondicion = idCambioCondicion;
	}



	public String getMotivoPrincipal() {
		return motivoPrincipal;
	}

	public void setMotivoPrincipal(String motivoPrincipal) {
		this.motivoPrincipal = motivoPrincipal;
	}

	public String getSubMotivo() {
		return subMotivo;
	}

	public void setSubMotivo(String subMotivo) {
		this.subMotivo = subMotivo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	


}