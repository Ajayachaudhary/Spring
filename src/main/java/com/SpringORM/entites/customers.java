package com.SpringORM.entites;

public class customers {

	private int customerID;
	
	private String customerName;
	
	private String customerAddress;

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	@Override
	public String toString() {
		return "Customer [ customerID " + customerID + ", customerName=" + customerName + ", customerAddress=" + customerAddress +"]";	
	}
	
	public customers(int customerID, String customerName, String customerAddres) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerAddress = customerAddres;
	}
	
	public customers() {
		super();
	}
	
	
}