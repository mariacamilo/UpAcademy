package io.altar.jseproject.model;

public class Shelf {
	private String  codigo;
	private String  capacidade;
	private String  produto;
	private double  preco;
	
	public Shelf (String codigo, String capacidade, String produto, double preco) {
		this.codigo = codigo;
		this.capacidade = capacidade;
		this.produto = produto;
		this.preco = preco;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}

