package io.altar.jseproject.textinterface;

import io.altar.jseproject.textinterface.States.MenuEditarProduto;
import io.altar.jseproject.textinterface.States.MenuEditarShelf;
import io.altar.jseproject.textinterface.States.MenuNovoProduto;
import io.altar.jseproject.textinterface.States.MenuNovoShelf;
import io.altar.jseproject.textinterface.States.MenuPrincipal;
import io.altar.jseproject.textinterface.States.MenuProduto;
import io.altar.jseproject.textinterface.States.MenuRemoverProduto;
import io.altar.jseproject.textinterface.States.MenuRemoverShelf;
import io.altar.jseproject.textinterface.States.MenuShelf;
import io.altar.jseproject.textinterface.States.MenuVerProduto;
import io.altar.jseproject.textinterface.States.MenuVerShelf;
import io.altar.jseproject.textinterface.States.State;

public class StateMachine {

	private State [] states = { 
			new MenuPrincipal () ,       //state 0
			new MenuProduto (),          //state 1
			new MenuShelf (),            //state 2
			new MenuNovoProduto (),      //state 3
			new MenuRemoverProduto (),   //state 4
			new MenuEditarProduto (),    //state 5
			new MenuVerProduto(),        //state 6
			new MenuNovoShelf (),        //state 7
			new MenuRemoverShelf (),     //state 8
			new MenuEditarShelf (),      //state 9
			new MenuVerShelf (),         //state 10
			
	};

	private int [] [] transition = {
			{1,2,0}, //state 0 - menu principal
			{3,4,5,6,0} ,//state 1 - menu product
			{7,8,9,10,0}, //state 2 - menu shelf
			{1}, //state 3  - came back to product menu
			{1},//state 4 - came back to product menu
			{1},  //state 5 - came back to product menu
			{1},  //state 6 - came back to product menu
			{2},  //state 7 - came back to shelf menu
			{2},  //state 8 - came back to shelf menu
			{2},  //state 9 - came back to shelf menu
			{2},  //state 10 - came back to shelf menu
	
			
	};
	
	private int current = 0; 
	
	public void start() {
		while (true) {
			int option = states[current].show();
			if (current == 0 && option == 3) {
				return;
			}
			current = transition[current][option-1];
		}
	}

}



