package com.sc.tesla.data;

import java.util.ArrayList;
import java.util.List;

import com.sc.tesla.beans.Customers;
import com.sc.tesla.util.DBConnection;
import java.sql.*;

public class CustomersDAO implements ICustomersData {

	Connection con = DBConnection.getConnection();

	@Override
	public String addCustomer(Customers c) {
		PreparedStatement stmt = null;
		try {

			String sql = "insert into customer values(?,?)";

			stmt = con.prepareStatement(sql);
			stmt.setInt(1, c.getCustomerId());
			stmt.setString(2, c.getCustomerName());
			stmt.executeUpdate(); // DQL // Select
									// executeQuery

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// TODO Auto-generated method stub
		return "adding";
	}

	@Override
	public List<Customers> displayCustomers() {
		// TODO Auto-generated method stub
		
		List<Customers> list= new ArrayList<Customers>();
		PreparedStatement pstmt= null;
		ResultSet rs = null;
		
		String sql= "select id, name from customer where name=?";
		try {
			pstmt= con.prepareStatement(sql);
			pstmt.setString(1, "credit");
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				 Customers c= new Customers();
				 c.setCustomerId(rs.getInt(1));
				 c.setCustomerName(rs.getString(2));
				 list.add(c);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	}

	@Override
	public Customers serachCustomer(int custId) {
		// TODO Auto-generated method stub
		return null;
	}

}
