package services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import daos.TurmaDAO;
import entities.Aluno;
import entities.Desempenho;
import entities.Nota;
import entities.Turma;

public class DesempenhoService  extends AbstractService{
	//static EntityManagerFactory fac  = Persistence.createEntityManagerFactory("bdAcademico");
	//EntityManager manager = fac.createEntityManager();
	
	public DesempenhoService(EntityManager manager) {
		super(manager);
	}

	public void Cadastro(Turma turma, Aluno aluno){
		//EntityManager manager = fac.createEntityManager();
		
		try {
			manager.getTransaction().begin();
			Desempenho desempenho = new Desempenho();
			desempenho.setTurma(turma);
			desempenho.setAluno(aluno);
			//desempenho.setNota(nota);
			
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

	public void Cadastro(Turma turma, Aluno aluno, Nota nota){
		//EntityManager manager = fac.createEntityManager();
		
		try {
			manager.getTransaction().begin();
			Desempenho desempenho = new Desempenho();
			desempenho.setTurma(turma);
			desempenho.setAluno(aluno);
			desempenho.setNota(nota);
			
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

	public void AddNota(Turma turma, Aluno aluno, Nota nota){
		//EntityManager manager = fac.createEntityManager();
		
		try {
			manager.getTransaction().begin();
			
			Desempenho desempenho = new Desempenho();
			desempenho.setTurma(turma);
			desempenho.setAluno(aluno);
			desempenho.setNota(nota);
			
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
