package io.altar.jseproject.textinterface.States;

public class MenuShelf extends State  {

	@Override
	public int show() {
		System.out.println ("Menu Shelf");
		System.out.println ("1- Criar nova prateleira");
		System.out.println ("2- Editar prateleira existente");
		System.out.println ("3- Remover prateleira");
		System.out.println ("4-Ver prateleira existente");
		System.out.println ("5- Voltar ao menu principal");
		int selecao = scan.getInRange (1,5);
		return selecao ;
	}

}
