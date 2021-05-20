package io.altar.jseproject.textinterface.States;

public class MenuProduto extends State {

	@Override
	public int show() {
		System.out.println ("Menu Produto");
		System.out.println ("Criar novo produto");
		System.out.println ("Editar produto existente");
		System.out.println ("Consultar produto");
		System.out.println ("Remover produto");
		System.out.println ("Voltar ao menu princiapl");
		int selecao = scan.getInRange(1,5);
		return selecao ;
	}

}
