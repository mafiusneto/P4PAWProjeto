package daos;

import javax.persistence.EntityManager;

import entities.Conta;

public class ContaDAO extends AbstractDAO<Conta> {

	public ContaDAO(EntityManager entity) {
		super(entity);
	}

	@Override
	public Class<Conta> entityClass() {
		return Conta.class;
	}
	


}
