package io.altar.jseproject.textinterface.States;

import io.altar.jseproject.repositories.Product_Repository;
import io.altar.jseproject.repositories.Shelf_Repository;
import io.altar.jseproject.textinterface.ScannerUtils;

public abstract class State {
	public abstract int show () ;
	ScannerUtils scan = new ScannerUtils ();
	Product_Repository pr = Product_Repository.getInstance();
	Shelf_Repository sr = Shelf_Repository.getInstance ();
}

