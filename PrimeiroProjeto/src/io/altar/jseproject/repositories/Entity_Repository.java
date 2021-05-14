package io.altar.jseproject.repositories;

import java.util.HashMap;
import java.util.Map;

import io.altar.jseproject.model.Entity_;

public abstract class Entity_Repository<T extends Entity_> {

	Map<Long, T> mapa = new HashMap<Long, T>();

	long currentId = 0;

	private T getEntity (long id) {
		return mapa.get(id);
	}
	
	private long nextId () {
		return  ++ currentId;
	}
	
}
