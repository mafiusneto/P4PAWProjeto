package services;

import javax.persistence.EntityManager;

public abstract class AbstractService {
	
	EntityManager manager;
	
	public AbstractService(EntityManager manager){
		this.manager = manager;
	}
}
