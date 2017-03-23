package services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import daos.ContaDAO;
import daos.MovimentoDAO;
import entities.Conta;
import entities.Movimento;

public class ContaService {
	static EntityManagerFactory fac  = Persistence.createEntityManagerFactory("conta_pu");
	
	public static void abreConta(Conta conta, Movimento movimento){

		EntityManager manager = fac.createEntityManager();
		try{
			manager.getTransaction().begin();
			ContaDAO dao = new ContaDAO(manager);
			dao.inserir(conta);
			MovimentoDAO movimentoDao = new MovimentoDAO(manager);
			movimentoDao.inserir(movimento);
			manager.getTransaction().commit();
		}catch (Exception e){
			manager.getTransaction().rollback();
		}
		finally{
			manager.close();
		}
	
	}
	
	public static void abreConta(Conta conta){

		EntityManager manager = fac.createEntityManager();
		try{
			manager.getTransaction().begin();
			ContaDAO dao = new ContaDAO(manager);
			dao.inserir(conta);
			manager.getTransaction().commit();
		}catch (Exception e){
			manager.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			manager.close();
		}
	
	}
	
	public static Conta buscarContaPorId(Long id){
		Conta conta = null;
		EntityManager manager = fac.createEntityManager();
		try{
			ContaDAO dao = new ContaDAO(manager);
			conta = dao.buscarPorId(id);
		}catch (Exception e){
			manager.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			manager.close();
		}
		return conta;
	
	}
	
}
