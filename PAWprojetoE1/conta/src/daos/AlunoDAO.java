package daos;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entities.Aluno;

public class AlunoDAO extends AbstractDAO<Aluno>{
	
	public AlunoDAO(EntityManager entity){
		super(entity);
	}

	@Override
	public Class<Aluno> entityClass() {
		return Aluno.class;
	}

	
	public Aluno getUsuario(String login, String senha){
		Query query =  manager.createQuery("select u from "+ entityClass().getSimpleName()+" u " +
				"where u.login = :login and u.senha = :senha");
		query.setParameter("login", login);
		query.setParameter("senha", senha);
		
		ArrayList<Aluno> lista = new ArrayList<Aluno>(query.getResultList());
		
		if (lista.size() > 0){
			return  lista.get(0);
		}else{
			return null;
		}
		
	}
}
