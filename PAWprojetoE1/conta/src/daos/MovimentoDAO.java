package daos;

import javax.persistence.EntityManager;

import entities.Movimento;


public class MovimentoDAO extends AbstractDAO<Movimento> {

	public MovimentoDAO(EntityManager entity) {
		super(entity);
	}

	@Override
	public Class<Movimento> entityClass() {
		return Movimento.class;
	}
	
	


}
