package io.altar.jseproject.textinterface.States;

import io.altar.jseproject.model.Product;

public class MenuEditarProduto extends State  {

	@Override
	public int show() {
		System.out.println ("Menu Editar Produto");
		System.out.println ("Selecione o ID do produto que deseja editar");
		long selectedId = scan.getInt (); 
		Product selectedProduct = pr.getEntity(selectedId);
		System.out.println (selectedProduct);
		System.out.println ("Introduza o novo valor do IVA");
		long iva = scan.getInRange(1, 23);
		selectedProduct.setIva(iva);
		System.out.println ("Introduza o novo valor do PVP");
		long pvp = scan.getInRange(1, 80);
		selectedProduct.setPvp(pvp);
		System.out.println ("Introduza o novo valor do desconto");
		long valorDesc = scan.getInRange(0, 70);
		selectedProduct.setdesc(valorDesc);
		pr.editeEntity (selectedProduct);
		return 1;
		
	}
	

}
