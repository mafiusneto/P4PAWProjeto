package services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import daos.AlunoDAO;
import daos.CursoDAO;
import entities.Aluno;
import entities.Curso;
import entities.Disciplina;
import entities.Professor;

public class CursoService  extends AbstractService{
	//static EntityManagerFactory fac  = Persistence.createEntityManagerFactory("bdAcademico");
	//EntityManager manager = fac.createEntityManager();

	public CursoService(EntityManager manager) {
		super(manager);
	}

	public void InserirCurso(Curso curso){
		//EntityManager manager = fac.createEntityManager();
		
		try {
			manager.getTransaction().begin();
			CursoDAO dao = new CursoDAO(manager);
			dao.inserir(curso);
			manager.getTransaction().commit();
		} catch (Exception e) {
			manager.getTransaction().rollback();
			e.printStackTrace();
		}finally {
			//manager.close();
		}
	}
	
	public void AddProfessor(Curso curso, Professor professor){
		//EntityManager manager = fac.createEntityManager();
		
		try {
			manager.getTransaction().begin();
			curso.setProfessor(professor);
			
			CursoDAO dao = new CursoDAO(manager);
			dao.atualizar(curso);
			manager.getTransaction().commit();
		} catch (Exception e) {
			manager.getTransaction().rollback();
			e.printStackTrace();
		}finally {
			//manager.close();
		}
	}
	
	public void AddDisciplina(Curso curso, Disciplina disciplina){
		//EntityManager manager = fac.createEntityManager();
		
		try {
			manager.getTransaction().begin();
			curso.setDisciplina(disciplina);
			
			CursoDAO dao = new CursoDAO(manager);
			dao.atualizar(curso);
			manager.getTransaction().commit();
		} catch (Exception e) {
			manager.getTransaction().rollback();
			e.printStackTrace();
		}finally {
			//manager.close();
		}
	}
}
