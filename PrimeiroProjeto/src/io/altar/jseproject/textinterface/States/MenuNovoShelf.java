package io.altar.jseproject.textinterface.States;

import io.altar.jseproject.model.Shelf;

public class MenuNovoShelf extends State{

	@Override
	public int show() {
		System.out.println ("Menu Novo Shelf");
		System.out.println ("Introduza a capacidade");
		int capacity = scan.getInRange (0, 1);
		System.out.println ("Introduza o valor diário");
		int dailyPrice = scan.getInRange(1,50);
		System.out.println ("Prima 1 para salvar ou 2 para cancelar");
		int selecao = scan.getInRange(1, 2);
		if (selecao ==1) {
			Shelf shelf = new Shelf (capacity, dailyPrice);
			sr.createEntity(shelf);
		} 
		return 1;
	}

}
