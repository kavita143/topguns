package com.sc.tesla.services;

import com.sc.tesla.beans.Customers;
import com.sc.tesla.data.CustomersDAO;

import java.util.*;

public class BanksImpl implements IBanks {
	
	
	CustomersDAO dao = new CustomersDAO();

	@Override
	public String addCustomer(String name, int custId) {
		Customers c= new Customers();
		c.setCustomerId(custId);
		c.setCustomerName(name);		
		return dao.addCustomer(c);
	}

	@Override
	public List<Customers> displayCustomers() {
		// TODO Auto-generated method stub
		return dao.displayCustomers();
	}

	@Override
	public Customers serachCustomer(int custId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
