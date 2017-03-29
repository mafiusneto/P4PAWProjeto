package services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import daos.AlunoDAO;
import entities.Aluno;
import entities.Curso;

public class AlunoService extends AbstractService{
	
	public AlunoService(EntityManager manager) {
		super(manager);
	}

	//static EntityManagerFactory fac  = Persistence.createEntityManagerFactory("bdAcademico");
	//EntityManager manager = fac.createEntityManager();
	
	public void Matricular(Curso curso, Aluno aluno){
		//EntityManager manager = fac.createEntityManager();
		
		try {
			manager.getTransaction().begin();
			aluno.setCurso(curso);
			
			AlunoDAO aDao = new AlunoDAO(manager);
			aDao.atualizar(aluno);
			manager.getTransaction().commit();
		} catch (Exception e) {
			manager.getTransaction().rollback();
			e.printStackTrace();
		}finally {
			//manager.close();
		}
	}
	
	
}
