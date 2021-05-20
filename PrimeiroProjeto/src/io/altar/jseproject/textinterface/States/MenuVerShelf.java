package io.altar.jseproject.textinterface.States;

public class MenuVerShelf extends State {

	@Override
	public int show() {
		System.out.println ("Menu Ver Shelf");
		System.out.println ("Qual o Id da prateleira que quer ver?");
		int selectedId = scan.getInt();
		System.out.println (sr.getEntity(selectedId));
		return 1 ;
	}

}
