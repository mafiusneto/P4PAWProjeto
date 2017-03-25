package teste;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Aluno;
import entities.Endereco;

public class Teste {
	public static void main(String[] args) {
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("bdAcademico");
		
		EntityManager manager = fac.createEntityManager();
		
		Aluno aluno = new Aluno();
		aluno.setLogin("alunoteste");
		aluno.setSenha("123456");
		aluno.setNome("Fulaninho da Silva");
		aluno.setMatricula(1510008636);
		aluno.setDataVinculo(new Date());
		
		Endereco ende = new Endereco();
		ende.setBairro("asdasd");
		ende.setCep("58123456");
		ende.setCidade("Jampa");
		ende.setComplemento("AP 203");
		ende.setEstado("PB");
		ende.setNumero("250");
		ende.setRua("rau do Ze Chulipa");
		
		aluno.setEndereco(ende);
		//aluno.setEndereco(endereco);
		
		try {
			manager.getTransaction().begin();
			manager.persist(aluno);
			
			manager.getTransaction().commit();
			
		} catch (Exception e) {
			manager.getTransaction().rollback();
		}
		manager.close();
		
		/*
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
		*/
		
		
		
		
	}
	

}
