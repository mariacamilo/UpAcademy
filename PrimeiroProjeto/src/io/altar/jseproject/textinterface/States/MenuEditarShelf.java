package io.altar.jseproject.textinterface.States;

import io.altar.jseproject.model.Shelf;

public class MenuEditarShelf extends State  {

	@Override
	public int show() {
		System.out.println ("Menu Editar Prateleira");
		System.out.println ("Selecione o ID da shelf que deseja editar");
		int selectedId = scan.getInt();
		Shelf selectedShelf = sr.getEntity (selectedId);
		System.out.println ("Introduza a capacidade da shelf");
		int capacity = scan.getInRange(0,1);
		selectedShelf.setcapacity (capacity);
		System.out.println ("Introduza o preço diário");
		int dailyPrice = scan.getInRange(0, 70);
		selectedShelf.setdailyPrice (dailyPrice);
		return 1; 
		
		
	}
	

}
