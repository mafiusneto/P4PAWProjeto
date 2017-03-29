package daos;

import javax.persistence.EntityManager;

import entities.Desempenho;

public class DesempenhoDAO extends AbstractDAO<Desempenho>{

	public DesempenhoDAO(EntityManager entity) {
		super(entity);
	}
	
	@Override
	public Class<Desempenho> entityClass() {
		return Desempenho.class;
	}

}
