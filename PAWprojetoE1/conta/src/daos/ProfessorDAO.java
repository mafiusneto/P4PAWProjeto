package daos;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entities.Professor;

public class ProfessorDAO extends AbstractDAO<Professor>{
	
	public ProfessorDAO(EntityManager entity){
		super(entity);
	}

	@Override
	public Class<Professor> entityClass() {
		return Professor.class;
	}

	
	public Professor getUsuario(String login, String senha){
		Query query =  manager.createQuery("select u from "+ entityClass().getSimpleName()+" u " +
				"where u.login = :login and u.senha = :senha");
		query.setParameter("login", login);
		query.setParameter("senha", senha);
		
		ArrayList<Professor> lista = new ArrayList<Professor>(query.getResultList());
		
		if (lista.size() > 0){
			return  lista.get(0);
		}else{
			return null;
		}
		
	}
}
