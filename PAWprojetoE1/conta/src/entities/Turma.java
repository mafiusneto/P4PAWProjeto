package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="turma", sequenceName="turma_seq", allocationSize=1)
@Inheritance(strategy=InheritanceType.JOINED)
public class Turma extends AbstractEntity{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="turma")
	private Long id;
	
	private int sementre;
	private int ano;
	
	@Override
	public Long getId() {
		return id;
	}
	
	@Override
	public void setId(Long id) {
		this.id = id;		
	}

	public int getSementre() {
		return sementre;
	}

	public void setSementre(int sementre) {
		this.sementre = sementre;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}
