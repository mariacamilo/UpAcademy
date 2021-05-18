package io.altar.jseproject.test;

import java.util.Iterator;

import io.altar.jseproject.model.Product;
import io.altar.jseproject.repositories.Product_Repository;
import io.altar.jseproject.textinterface.TextInterface;


public class App {

	public static void main(String[] args) {
		
		 TextInterface ti = new TextInterface ();
		 ti.getFirst();
		 
		
//		Product_Repository pr = Product_Repository.getInstance();
//		Product p = new Product ();
//		p.setIva(23);
//		p.setPvp(10);
//		p.setValorUniDes(0);
//		pr.createEntity (p);
//		Iterator <Product> it = pr.getAll ().iterator();
//	
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
	}

}
