package io.altar.jseproject.repositories;

import io.altar.jseproject.model.Product;

public class Product_Repository extends Entity_Repository <Product> {

	private static final Product_Repository instance = new Product_Repository(); //constructor
	private Product_Repository ( ) {
		
	}
	public static Product_Repository getInstance () {
		return instance ;
	}
	
	
}
