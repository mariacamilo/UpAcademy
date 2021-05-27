package io.altar.jseproject.textinterface.States;

public class MenuVerProduto extends State{

	@Override
	public int show() {
		System.out.println ("Menu Ver Produto");
		System.out.println ("Qual o ID do produto que quer ver?");
		int selectedId = scan.getInt() ;  // o scanner will read the chosen id.
		System.out.println (pr.getEntity(selectedId)); //o pr came from state class. 
	
		return 1; // return the only option from state machine.
	}

}