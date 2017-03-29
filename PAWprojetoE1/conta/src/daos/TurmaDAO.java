package daos;

import javax.persistence.EntityManager;

import entities.Turma;

public class TurmaDAO extends AbstractDAO<Turma>{
	
	public TurmaDAO(EntityManager entity){
		super(entity);
	}

	@Override
	public Class<Turma> entityClass() {
		return Turma.class;
	}

}
