package io.altar.jseproject.model;

public class Shelf extends Entity_ {
	private int  capacity;
	private int  productId;
	private float  dailyPrice;
	
	public Shelf ( int capacity, int productId, float dailyPrice) {
		
		this.capacity = capacity;
		this.productId = productId;
		this.dailyPrice = dailyPrice;
	}

	public Shelf (int capacity, float dailyPrice ) {
		this.capacity = capacity;
		this.dailyPrice = dailyPrice;
	}
	
	public Shelf () {}
	

	public int getcapacity() {
		return capacity;
	}

	public void setcapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getproductId() {
		return productId;
	}

	public void setproductId(int productId) {
		this.productId = productId;
	}

	public float getdailyPrice() {
		return dailyPrice;
	}

	public void setdailyPrice(float dailyPrice) {
		this.dailyPrice = dailyPrice;
	}
}

