package io.altar.jseproject.repositories;

import io.altar.jseproject.model.Shelf;

public class Shelf_Repository extends Entity_Repository <Shelf> {

	private static final Shelf_Repository instance = new Shelf_Repository(); // constructor

	private Shelf_Repository() {

	}

	public static Shelf_Repository getInstance() {
		return instance;
	}

}
