package io.altar.jseproject.textinterface;

public class TextInterface {

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
		System.out.println("Selecione uma opção relacionada com os produtos:");
		System.out.println("1) Criar novo produto");
		System.out.println("2) Editar produto existente");
		System.out.println("3) Consultar detahe do produto");
		System.out.println("4) Remover um produto");
		System.out.println("5) Voltar ao menu principal");

		int number = scan.getInt(1, 5);
		switch (number) {
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("to do");
			break;
		case 5:
			return;
		}
	}

	public void getThird() {
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
