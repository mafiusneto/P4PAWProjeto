package test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Conta;

public class Teste {
	public static void main(String[] args) {
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("conta_pu");
		
		EntityManager manager = fac.createEntityManager();
		
		Conta conta = new Conta();
		
		conta.setCreditoBloqueado(false);
		
		conta.setDataAbertura(new Date());
		
		conta.setNome("Corrente Especial");
		
		manager.getTransaction().begin();
		
		manager.persist(conta);
		
		manager.getTransaction().commit();
		
		manager.close();
		
		
		manager = fac.createEntityManager();
		
		manager.getTransaction().begin();
		
		conta = new Conta();
		
		conta.setId(10L);
		
		manager.merge(conta);
		
		manager.getTransaction().commit();
		
		
		
		
	}
	

}
