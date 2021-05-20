package io.altar.jseproject.textinterface.States;

public class MenuShelf extends State  {

	@Override
	public int show() {
		System.out.println ("Menu Shelf");
		System.out.println ("Criar nova prateleira");
		System.out.println ("Editar prateleira existente");
		System.out.println ("Remover prateleira");
		System.out.println ("Voltar ao menu princiapl");
		int selecao = scan.getInRange (1,5);
		return selecao ;
	}

}
