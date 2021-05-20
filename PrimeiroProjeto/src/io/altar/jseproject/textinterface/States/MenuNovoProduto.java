package io.altar.jseproject.textinterface.States;

import io.altar.jseproject.model.Product;

public class MenuNovoProduto extends State  {

	@Override
	public int show() {
		System.out.println ("Menu Novo Produto");
		System.out.println ("Introduza o IVA do produto");
		double iva = scan.getInRange(1,23);
		System.out.println ("Introduza o PVP do produto");
		double pvp = scan.getInRange(1,80);
		System.out.println ("Introduza o desconto do produto");
		double desc = scan.getInRange(0, 70);
		Product p = new Product (desc, iva, pvp);
		pr.createEntity(p);
		return 1;
	}
}
