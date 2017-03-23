package teste;

import java.util.ArrayList;
import java.util.Date;

import services.ContaService;
import entities.Corrente;
import entities.Movimento;

public class Teste {

	public static void main(String[] args) {
		Corrente corrente = new Corrente();
		corrente.setTaxaManutencao(10.0);
		corrente.setDataAbertura(new Date());
		corrente.setNome("Ribas");
		
		Movimento movimento = new Movimento();
		movimento.setDataHora(new Date());
		movimento.setSaldo(100.0);
		
		movimento.setConta(corrente);
		
		corrente.setMovimentos(new ArrayList<Movimento>());
		corrente.getMovimentos().add(movimento);
		
		
		
		ContaService.abreConta(corrente);
		
	}

}
