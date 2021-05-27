package io.altar.jseproject.textinterface.States;

public class MenuProduto extends State {

	@Override
	public int show() {
		System.out.println ("Menu Produto");
		System.out.println ("1- Criar novo produto");
		System.out.println ("2- Editar produto existente");
		System.out.println ("3- Consultar produto");
		System.out.println ("4- Remover produto");
		System.out.println ("5- Voltar ao menu princiapl");
		int selecao = scan.getInRange(1,5);
		return selecao ;
	}

}
