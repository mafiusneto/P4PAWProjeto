package daos;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entities.Usuario;

public class UsuarioDAO extends AbstractDAO<Usuario>{
	
	public UsuarioDAO(EntityManager entity){
		super(entity);
	}

	@Override
	public Class<Usuario> entityClass() {
		return Usuario.class;
	}

	
	public Usuario getUsuario(String login, String senha){
		Query query =  manager.createQuery("select u from "+ entityClass().getSimpleName()+" u " +
				"where u.login = :login and u.senha = :senha");
		query.setParameter("login", login);
		query.setParameter("senha", senha);
		
		ArrayList<Usuario> lista = new ArrayList<Usuario>(query.getResultList());
		
		if (lista.size() > 0){
			return  lista.get(0);
		}else{
			return null;
		}
		
	}
}
