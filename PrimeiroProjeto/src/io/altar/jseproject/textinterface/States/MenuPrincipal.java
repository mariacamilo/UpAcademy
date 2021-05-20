package io.altar.jseproject.textinterface.States;

public class MenuPrincipal extends State  {

	@Override
	public int show () {
		System.out.println ("Menu Principal");
		System.out.println ("Para menu Produto digite 1");
		System.out.println ("Para menu Shelf digite 2");
		return scan.getInRange (1,2); 
		
	}

}
