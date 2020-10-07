package com.sc.tesla.services;

import com.sc.tesla.beans.Customers;
import java.util.*;

public interface IBanks {
	
	
	public String addCustomer( String name, int custId);
	public List<Customers> displayCustomers();
	public Customers serachCustomer(int custId);

}
