package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="endereco", sequenceName="endereco_seq", allocationSize=1) //cria o generator para POSTGRES, mysql não precisa
//@Inheritance(strategy=InheritanceType.JOINED)
public class Endereco {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="endereco")
	private Long id;
	
	private String rua;
	private String cep;
	private String bairro;
	private String numero;
	private String complemento;
	private String cidade;
	private String estado;
	
	

}
