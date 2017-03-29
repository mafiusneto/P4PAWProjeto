package services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import daos.CursoDAO;
import daos.TurmaDAO;
import entities.Disciplina;
import entities.Professor;
import entities.Turma;

public class TurmaService  extends AbstractService{
	//static EntityManagerFactory fac  = Persistence.createEntityManagerFactory("bdAcademico");
	//EntityManager manager = fac.createEntityManager();
	
	public TurmaService(EntityManager manager) {
		super(manager);
	}

	public void Cadastro(Turma turma, Disciplina disciplina, Professor professor){
		//EntityManager manager = fac.createEntityManager();
		
		try {
			manager.getTransaction().begin();
			turma.setDisciplina(disciplina);
			turma.setProfessor(professor);
			
			TurmaDAO dao = new TurmaDAO(manager);
			dao.atualizar(turma);
			manager.getTransaction().commit();
		} catch (Exception e) {
			manager.getTransaction().rollback();
			e.printStackTrace();
		}finally {
			//manager.close();
		}
	}

}
