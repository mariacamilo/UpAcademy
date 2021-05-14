package io.altar.jseproject.model;

import java.util.ArrayList;
import java.util.List;

public class Product extends Entity_ {

	private List<Long> shelfIn = new ArrayList<Long>();
	private int valorUniDes;
	private int iva;
	private float pvp;
	
	public Product () { }

	public Product( List<Long> shelfIn , int valorUniDes, int iva, float pvp) {
	
		this.shelfIn = shelfIn;
		this.valorUniDes = valorUniDes;
		this.iva = iva;
		this.pvp = pvp;
	}

	

	public List<Long> getShelfIn() {
		return shelfIn;
	}

	public void setShelfIn(List<Long> shelfIn) {
		this.shelfIn = shelfIn;
	}

	public double getValorUniDes() {
		return valorUniDes;
	}

	public void setValorUniDes(int valorUniDes) {
		this.valorUniDes = valorUniDes;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public double getPvp() {
		return pvp;
	}

	public void setPvp(float pvp) {
		this.pvp = pvp;
	}

	@Override
	public String toString() {
		return "Product [shelfIn=" + shelfIn + ", valorUniDes=" + valorUniDes + ", iva=" + iva + ", pvp=" + pvp + "]";
	}
	
	
}
