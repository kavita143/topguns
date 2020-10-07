package com.sc.tesla.main;

import java.util.*;

import com.sc.tesla.beans.Customers;
import com.sc.tesla.services.*;
import com.sc.tesla.util.InputValidataion;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BanksImpl service= new BanksImpl();
	

		Scanner sc = new Scanner(System.in);
				while (true) {
			System.out.println(
					"welcome to SCB Bank \n 1 to add new cutomer \n 2 to display customers \n 3 to search customer \n 4 to exit application");

			Integer option = sc.nextInt();

			switch (option) {

			case 1:

				boolean flag = false;
				int i=0;
				while (!flag) {
					System.out.println("please enter custid");

					String custId = sc.next();
					
					 i=Integer.parseInt(custId);

					if (!InputValidataion.idValidation(custId))
						System.out.println("please enter correct value");
					else
						flag = true;

				}

				System.out.println("please enter name");
				String name = sc.next();
			
				
				 String msg= service.addCustomer( name, i);
				break;

			case 2:
				
				List<Customers> l=service.displayCustomers();
				System.out.println(l);
				
			
				break;

			case 3:
				System.out.println("please enter custid");
				int custId1 = sc.nextInt();
			

				break;

			case 4:
				System.exit(1);
			default:
				System.out.println("please enter valid option");

			}

		}
	}

}
