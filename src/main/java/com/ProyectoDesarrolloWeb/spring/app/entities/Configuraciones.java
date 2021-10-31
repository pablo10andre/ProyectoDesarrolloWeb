package com.ProyectoDesarrolloWeb.spring.app.entities;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "configuraciones")
public class Configuraciones extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private BigDecimal Porcentaje_adanual;
	private BigDecimal Costo_USA_GT;
	private BigDecimal Costo_Envio_local;
	private BigDecimal Porcentaje_Ganancia;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public BigDecimal getPorcentaje_adanual() {
		return Porcentaje_adanual;
	}
	public void setPorcentaje_adanual(BigDecimal porcentaje_adanual) {
		Porcentaje_adanual = porcentaje_adanual;
	}
	public BigDecimal getCosto_USA_GT() {
		return Costo_USA_GT;
	}
	public void setCosto_USA_GT(BigDecimal costo_USA_GT) {
		Costo_USA_GT = costo_USA_GT;
	}
	public BigDecimal getCosto_Envio_local() {
		return Costo_Envio_local;
	}
	public void setCosto_Envio_local(BigDecimal costo_Envio_local) {
		Costo_Envio_local = costo_Envio_local;
	}
	public BigDecimal getPorcentaje_Ganancia() {
		return Porcentaje_Ganancia;
	}
	public void setPorcentaje_Ganancia(BigDecimal porcentaje_Ganancia) {
		Porcentaje_Ganancia = porcentaje_Ganancia;
	}

	
	
}
