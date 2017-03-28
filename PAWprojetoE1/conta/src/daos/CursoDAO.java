package daos;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entities.Curso;

public class CursoDAO extends AbstractDAO<Curso>{
	
	public CursoDAO(EntityManager entity){
		super(entity);
	}

	@Override
	public Class<Curso> entityClass() {
		return Curso.class;
	}

}
