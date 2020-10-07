package com.sc.tesla.beans;

public class Customers implements Comparable<Customers>{
	
	private int customerId;
	private String customerName;
	private Address adr;
	
	
	public Address getAdr() {
		return adr;
	}
	public void setAdr(Address adr) {
		this.adr = adr;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "Customers [customerId=" + customerId + ", customerName=" + customerName + "]";
	}
	@Override
	public int compareTo(Customers o) {
		// TODO Auto-generated method stub
		
		if(o.getCustomerId()<this.getCustomerId()) {
			return 1;
		}
		else if(o.getCustomerId()>this.getCustomerId())
			return -1;
		else
			return 0;
	}
	

}
