package entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Corrente extends Conta{
	
	@Column(nullable=false)
	private Double taxaManutencao;

	public Double getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(Double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}
}
