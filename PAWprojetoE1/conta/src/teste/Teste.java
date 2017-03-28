package teste;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import daos.UsuarioDAO;
import entities.Aluno;
import entities.Endereco;
import entities.Professor;
import entities.Usuario;
import services.UsuarioService;

public class Teste {
	public static void main(String[] args) {
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("bdAcademico");
		
		EntityManager manager = fac.createEntityManager();
		
		UsuarioService userD = new UsuarioService();
		Usuario user = userD.Logar("Teste", "123456");
		if (user != null ){
			System.out.println("Senha Achou: "+user.getNome());
		}else{
			System.out.println("Não achou!");
		}
		
		user = null;
		user = userD.BuscarPorId(9L);
		if (user != null ){
			System.out.println("Id Achou: "+user.getNome());
		}else{
			System.out.println("Não achou!");
		}
		
		/*
		Professor prof = new Professor();
		prof.setLogin("Teste outro");
		prof.setSenha("123456");
		prof.setNome("Fulaninho da Silva");
		prof.setMatricula(1510008636);
		prof.setTitulacao("Metre");
		prof.setAreaAtuacao("POPOP");

		Endereco ende = new Endereco();
		ende.setBairro("asdasd");
		ende.setCep("58123456");
		ende.setCidade("Jampa");
		ende.setComplemento("AP 203");
		ende.setEstado("PB");
		ende.setNumero("250");
		ende.setRua("rau do Ze Chulipa");
		
		prof.setEndereco(ende);
		userD.InserirUsuario(prof);
		
		
		
		//ArrayList<Professor> lProf = new ArrayList<Professor>(userD.listar());
		
		
		
		
		
		/* Teste inserindo usuario
		Aluno aluno = new Aluno();
		aluno.setLogin("Teste outro");
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
		
		userD.InserirUsuario(aluno);
		/* Inserindo
		Aluno aluno = new Aluno();
		aluno.setLogin("Teste");
		aluno.setSenha("123456");
		aluno.setNome("Fulaninho da Silva");
		aluno.setMatricula(1510008636);
		aluno.setDataVinculo(new Date());
		//aluno.setId(5L);
		
		Endereco ende = new Endereco();
		ende.setBairro("asdasd");
		ende.setCep("58123456");
		ende.setCidade("Jampa");
		ende.setComplemento("AP 203");
		ende.setEstado("PB");
		ende.setNumero("250");
		ende.setRua("rau do Ze Chulipa");
		
		aluno.setEndereco(ende);
				

		
		
		try {
			manager.getTransaction().begin();
			manager.persist(ende);
			manager.persist(aluno);
			
			manager.getTransaction().commit();
			
		} catch (Exception e) {
			manager.getTransaction().rollback();
		}
		*/
		
		/*Busca dados* /
		
		Aluno aluno = manager.find(Aluno.class, 9L);
		System.out.println("Achou: "+aluno.getNome());
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
