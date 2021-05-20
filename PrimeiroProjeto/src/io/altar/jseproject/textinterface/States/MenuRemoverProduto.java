package io.altar.jseproject.textinterface.States;

public class MenuRemoverProduto extends State{

	@Override
	public int show() {
		System.out.println ("Menu Remover Produto");
		System.out.println ("Indique o ID do produto que quer remover");
		long selectedId = scan.getInt ();
		pr.removeFromDataBase (selectedId);
		return 1;
	}

}
