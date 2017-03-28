package services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import daos.CursoDAO;
import entities.Curso;

public class CursoService {
	static EntityManagerFactory fac  = Persistence.createEntityManagerFactory("bdAcademico");

	public void InserirCurso(Curso curso){
		EntityManager manager = fac.createEntityManager();
		try {
			manager.getTransaction().begin();
			CursoDAO dao = new CursoDAO(manager);
			dao.inserir(curso);
			manager.getTransaction().commit();
		} catch (Exception e) {
			manager.getTransaction().rollback();
			e.printStackTrace();
		}finally {
			manager.close();
		}
	}
	
}
