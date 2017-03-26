package services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import daos.UsuarioDAO;
import entities.Usuario;

public class UsuarioService {
	static EntityManagerFactory fac  = Persistence.createEntityManagerFactory("bdAcademico");
	
	public Usuario Logar(String login, String senha){

		EntityManager manager = fac.createEntityManager();
		Usuario user = null;
		
		
		try{
			//manager.getTransaction().begin();
			UsuarioDAO dao = new UsuarioDAO(manager);
			user = dao.getUsuario(login, senha);
			//dao.inserir(conta);
			//MovimentoDAO movimentoDao = new MovimentoDAO(manager);
			//movimentoDao.inserir(movimento);
			//manager.getTransaction().commit();
						
			
		}catch (Exception e){
			//manager.getTransaction().rollback();
		}
		finally{
			manager.close();
		}
		
		return user;
	}

}
