package io.altar.jseproject.model;

import java.util.ArrayList;
import java.util.List;

public class Product extends Entity_ {

	private List<Long> shelfIn = new ArrayList<Long>();
	private double desc;
	private double iva;
	private double pvp;
	
	

	public Product( List<Long> shelfIn , double desc, double iva, double pvp) {
	
		this.shelfIn = shelfIn;
		this.desc = desc;
		this.iva = iva;
		this.pvp = pvp;
	}
	
	public Product ( double desc, double iva, double pvp) {
		this.desc = desc;
		this.iva = iva;
		this.pvp = pvp;
	}
	
	public Product () {
		
	}
	


	public List<Long> getShelfIn() {
		return shelfIn;
	}

	public void setShelfIn(List<Long> shelfIn) {
		this.shelfIn = shelfIn;
	}

	public double getdesc() {
		return desc;
	}

	public void setdesc(double desc) {
		this.desc = desc;
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

	@Override
	public String toString() {
		return "Product "+getId()+" [shelfIn=" + shelfIn + ", desc=" + desc + ", iva=" + iva + ", pvp=" + pvp + "]";
	}

	
	
	
}
