package entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SequenceGenerator(name="conta", sequenceName="conta_seq", allocationSize=1)
@Inheritance(strategy=InheritanceType.JOINED )

public class Conta extends AbstractEntity{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="conta")
	private Long id;
	
	private String nome;
	
	@Temporal(TemporalType.DATE)
	private Date dataAbertura;
	
	@Temporal(TemporalType.DATE)
	private Date dataFechamento;
	
	private Boolean debitoBloqueado;
	
	private Boolean creditoBloqueado;
	
	@OneToMany(mappedBy="conta", fetch=FetchType.EAGER, cascade={CascadeType.PERSIST,CascadeType.REMOVE})
	private List<Movimento> movimentos;
	
	public Conta(){
		
	}
	
	public Conta(Long id){
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public Date getDataFechamento() {
		return dataFechamento;
	}
	public void setDataFechamento(Date dataFechamento) {
		this.dataFechamento = dataFechamento;
	}
	public Boolean getDebitoBloqueado() {
		return debitoBloqueado;
	}
	public void setDebitoBloqueado(Boolean debitoBloqueado) {
		this.debitoBloqueado = debitoBloqueado;
	}
	public Boolean getCreditoBloqueado() {
		return creditoBloqueado;
	}
	public void setCreditoBloqueado(Boolean creditoBloqueado) {
		this.creditoBloqueado = creditoBloqueado;
	}

	public List<Movimento> getMovimentos() {
		return movimentos;
	}

	public void setMovimentos(List<Movimento> movimentos) {
		this.movimentos = movimentos;
	}

}
