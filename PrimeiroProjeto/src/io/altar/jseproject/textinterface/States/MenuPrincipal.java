package io.altar.jseproject.textinterface.States;

public class MenuPrincipal extends State  {

	@Override
	public int show () {
		System.out.println ("Menu Principal");
		System.out.println ("1- Para menu Produto");
		System.out.println ("2- Para menu Shelf");
		return scan.getInRange (1,2); 
		
	}

}
