package io.altar.jseproject.repositories;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import io.altar.jseproject.model.Entity_;

public abstract class Entity_Repository<T extends Entity_> {

	Map<Long, T> mapa = new HashMap<Long, T>();

	long currentId = 0;
	
	private long nextId () {
		return ++ currentId;
	}
	
	
	//create entities
	public long createEntity (T entidade) {
		entidade.setId(nextId());
		mapa.put(entidade.getId(), entidade);
		return entidade.getId();
		
	}
	
	//Edit entities
	public void editeEntity (T entidade) {
		mapa.put (entidade.getId(), entidade);
	}

	//consulter entities 
	
	public T getEntity (long id) {
		return mapa.get(id);
	}
	
	//remover entities
	public void removeFromDataBase (Long id) {
		mapa.remove(id);
	}
	
	public Collection<T> getAll () {
		return mapa.values(); 
	}
	
}


