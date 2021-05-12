package io.altar.jseproject.model;

public class Product {

	private int id;
	private int shelfIn;
	private double valorUniDes;
	private double iva;
	private double pvp;

	public Product(int id, int shelfIn, double valorUniDes, double iva, double pvp) {
		this.id = id;
		this.shelfIn = shelfIn;
		this.valorUniDes = valorUniDes;
		this.iva = iva;
		this.pvp = pvp;
	}

	public double getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getShelfIn() {
		return shelfIn;
	}

	public void setShelfIn(int shelfIn) {
		this.shelfIn = shelfIn;
	}

	public double getValorUniDes() {
		return valorUniDes;
	}

	public void setValorUniDes(double valorUniDes) {
		this.valorUniDes = valorUniDes;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public double getPvp() {
		return pvp;
	}

	public void setPvp(double pvp) {
		this.pvp = pvp;
	}
}
