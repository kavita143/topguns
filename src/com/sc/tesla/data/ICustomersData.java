package com.sc.tesla.data;

import java.util.*;

import com.sc.tesla.beans.Customers;

public interface ICustomersData {
	
	public String addCustomer(Customers c);
	public List<Customers> displayCustomers();
	public Customers serachCustomer(int custId);

}
