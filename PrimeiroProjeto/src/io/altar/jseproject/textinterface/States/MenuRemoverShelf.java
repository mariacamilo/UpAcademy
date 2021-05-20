package io.altar.jseproject.textinterface.States;

public class MenuRemoverShelf extends State  {

	@Override
	public int show() {
		System.out.println ("Menu Remover Shelf");
		System.out.println ("Indique qual o ID da prateleira que quer remover");
		int shelfSelected = scan.getInt();
		sr.removeFromDataBase(shelfSelected);
		return 1;
	}

}
