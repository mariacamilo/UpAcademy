package io.altar.jseproject.textinterface;

import java.util.Iterator;

import io.altar.jseproject.model.Product;
import io.altar.jseproject.repositories.Product_Repository;
import io.altar.jseproject.repositories.Shelf_Repository;

public class TextInterface {

	Product_Repository pr = Product_Repository.getInstance();
	Shelf_Repository sr = Shelf_Repository.getInstance();
	ScannerUtils scan = new ScannerUtils();

	public void getFirst() {
		while (true) {
			System.out.println("Selecione uma das opções:");
			System.out.println("1) Listar produtos");
			System.out.println("2) Listar prateleiras");
			System.out.println("3) Sair ");

			int number = scan.getInt(1, 3);
			switch (number) {
			case 1:
				getSecond();
				break;
			case 2:
				getThird();
				break;
			case 3:
				return;
			}
		}

	}

	public void getSecond() {
		while (true) {
			Iterator<Product> it = pr.getAll().iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
			System.out.println("Selecione uma opção relacionada com os produtos:");
			System.out.println("1) Criar novo produto");
			System.out.println("2) Editar produto existente");
			System.out.println("3) Consultar detahe do produto");
			System.out.println("4) Remover um produto");
			System.out.println("5) Voltar ao menu principal");

			int number = scan.getInt(1, 5);
			switch (number) {
			case 1:
				creatProduct();
				break;
			case 2:
				editeProduct();
				break;
			case 3:
				consultProduct();
				break;
			case 4:
				removeProduct();
				break;
			case 5:
				return;
			}
		}
	}

	private void removeProduct(Product p) {
		System.out.println ("Insira o ID da prateleira de onde deseja remover o produto");
		long id = scan.getInt();
		//TODO
	}

	private void consultProduct() {
		//TODO
	}

	private void editeProduct() {
		   //TODO 
	}

	public void creatProduct() {
		Product p = new Product();
		p.setIva(23);
		p.setPvp(10);
		p.setValorUniDes(0);
		pr.createEntity(p);
	}

	public void getThird() {
		while (true) {
			System.out.println("Selecione uma opção relacionada com as prateleiras:");
			System.out.println("1) Criar nova prateleira");
			System.out.println("2) Editar prateleira existente");
			System.out.println("3) Consultar prateleira existente");
			System.out.println("4) Remover uma prateleira");
			System.out.println("5) Voltar ao menu principal");

			int number = scan.getInt(1, 5);
			switch (number) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				return;
			}
		}
	}

}
