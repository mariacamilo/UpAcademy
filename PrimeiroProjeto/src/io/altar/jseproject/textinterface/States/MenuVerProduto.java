package io.altar.jseproject.textinterface.States;

public class MenuVerProduto extends State{

	@Override
	public int show() {
		System.out.println ("Menu Ver Produto");
		System.out.println ("Qual o ID do produto que quer ver?");
		int selectedId = scan.getInt() ;
		System.out.println (pr.getEntity(selectedId));
		return 1;
	}

}