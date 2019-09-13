package com.smartkode.primero.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smartkode.primero.entidad.Alumno;

@Repository
public abstract class AlumnoDAOImp implements AlumnoDAO {
	

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void addAlumno(Alumno a) {
		getCurrentSession().save(a);
	}

	
}
