package com.smartkode.primero.entidad;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "alumno")
public class Alumno implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id_alumno")
    private long id_alumno;
     @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "matricula",unique = true)
    private Long matricula;
	public long getId_alumno() {
		return id_alumno;
	}
	public void setId_alumno(long id_alumno) {
		this.id_alumno = id_alumno;
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
	public Long getMatricula() {
		return matricula;
	}
	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    


}