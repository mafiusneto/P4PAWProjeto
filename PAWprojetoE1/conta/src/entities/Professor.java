package entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Professor extends Usuario{
	
	private String areaAtuacao;
	private String titulacao;
	
	@OneToMany(mappedBy="professor", fetch=FetchType.EAGER, cascade={CascadeType.PERSIST,CascadeType.REMOVE})
	private List<Curso> cursos;
	
	public String getAreaAtuacao() {
		return areaAtuacao;
	}
	
	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}
	
	public String getTitulacao() {
		return titulacao;
	}
	
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	public List<Curso> getCursos() {
		return cursos;
	}
	
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
}
