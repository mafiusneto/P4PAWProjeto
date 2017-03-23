package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="usuario", sequenceName="usuario_seq", allocationSize=1)
@Inheritance(strategy=InheritanceType.JOINED)
public class Usuario extends AbstractEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="usuario")
	private Long id;
	
	private String login;
	private String senha;
	private String nome;
	private int matricula;
	private Endereco endereco;
	
	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;		
	}

}