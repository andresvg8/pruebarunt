package com.andresvg.pruebarunt.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ANDRES
 *
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Curso {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Number grado;
	private String salon;
	private List<Asignatura> asignaturas;
	
	public Number getGrado() {
		return grado;
	}
	public void setGrado(Number grado) {
		this.grado = grado;
	}
	public String getSalon() {
		return salon;
	}
	public void setSalon(String salon) {
		this.salon = salon;
	}
	public List<Asignatura> getAsignaturas() {
		return asignaturas;
	}
	public void setAsignaturas(List<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}
	
}
