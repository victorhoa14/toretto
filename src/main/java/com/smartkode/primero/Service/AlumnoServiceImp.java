package com.smartkode.primero.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.smartkode.primero.DAO.AlumnoDAO;
import com.smartkode.primero.entidad.Alumno;


public class AlumnoServiceImp {
	@Autowired   
	private AlumnoDAO a;
	@Autowired
	public void addPhone(Alumno a1) 
	{        
		this.a.addAlumno(a1); 
		
	}
    

}
