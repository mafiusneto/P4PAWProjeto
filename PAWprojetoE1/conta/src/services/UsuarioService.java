package services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.omg.PortableInterceptor.USER_EXCEPTION;

import daos.UsuarioDAO;
import entities.Usuario;

public class UsuarioService {
	static EntityManagerFactory fac  = Persistence.createEntityManagerFactory("bdAcademico");
	static EntityManager manager = fac.createEntityManager();
	
	
	public Usuario Logar(String login, String senha){

		//EntityManager manager = fac.createEntityManager();
		Usuario user = null;
		
		
		try{
			UsuarioDAO dao = new UsuarioDAO(manager);
			user = dao.getUsuario(login, senha);

			//manager.getTransaction().begin();
			//dao.inserir(conta);
			//MovimentoDAO movimentoDao = new MovimentoDAO(manager);
			//movimentoDao.inserir(movimento);
			//manager.getTransaction().commit();						
		}catch (Exception e){
			//manager.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			//manager.close();
		}
		
		return user;
	}
	
	public void InserirUsuario(Usuario usuario){
		//EntityManager manager = fac.createEntityManager();
		try {
			manager.getTransaction().begin();
			UsuarioDAO dao = new UsuarioDAO(manager);
			dao.inserir(usuario);
			manager.getTransaction().commit();
		} catch (Exception e) {
			manager.getTransaction().rollback();
			e.printStackTrace();
		}finally {
			//manager.close();
		}
	}
	
	public void ExcluirUsuario(Usuario usuario){
		//EntityManager manager = fac.createEntityManager();
		try {
			manager.getTransaction().begin();
			UsuarioDAO dao  = new UsuarioDAO(manager);
			dao.excluir(usuario);
			manager.getTransaction().commit();
		} catch (Exception e) {
			manager.getTransaction().rollback();
			e.printStackTrace();
		}finally {
			//manager.close();
		}
	}
	
	public void AtualizarUsuario(Usuario usuario){
		//EntityManager manager = fac.createEntityManager();
		try {
			manager.getTransaction().begin();
			UsuarioDAO dao = new UsuarioDAO(manager);
			dao.atualizar(usuario);
			manager.getTransaction().commit();
		} catch (Exception e) {
			manager.getTransaction().rollback();
			e.printStackTrace();
		}finally {
			//manager.close();
		}
	}
	
	public Usuario BuscarPorId(Long id){
		//EntityManager manager = fac.createEntityManager();
		Usuario usuario = null;
		try {
			manager.getTransaction().begin();
			UsuarioDAO dao = new UsuarioDAO(manager);
			usuario = dao.buscarPorId(id);
			manager.getTransaction().commit();
		} catch (Exception e) {
			manager.getTransaction().rollback();
			e.printStackTrace();
		}finally {
			//manager.close();
		}
		return usuario;
	}

	
	public List<Usuario> listar(){
		//EntityManager manager = fac.createEntityManager();
		List<Usuario> lista = null;
		try {
			manager.getTransaction().begin();
			UsuarioDAO dao = new UsuarioDAO(manager);
			lista = dao.listar();
			//dao.buscarPorId(usuario);
			manager.getTransaction().commit();
		} catch (Exception e) {
			manager.getTransaction().rollback();
			e.printStackTrace();
		}finally {
			//manager.close();
		}
		return lista;
	}
}
