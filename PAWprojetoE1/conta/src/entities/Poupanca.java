package entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Poupanca extends Conta{
	
	@Column(nullable=false)
	private String variacao;

	public String getVariacao() {
		return variacao;
	}

	public void setVariacao(String variacao) {
		this.variacao = variacao;
	}

}
