package com.trg.invoicing.account;

import java.util.ArrayList;
import java.util.List;

import com.trg.invoicing.customer.Customer;
import com.trg.invoicing.invoice.Invoice;
import com.trg.invoicing.order.Service;

/**
 * @author christosioannides
 *
 here I created account and customer and add services and invoice */ 
public class Account {
	
	private AccountNumber id;
	private Customer customer;

	private Double balance = 0D;
	
	List<Service> services = new ArrayList<>();
	List<Invoice> invoices = new ArrayList<>();
	// here is the constructor with customer as input 
	public Account(Customer customer) {
		
		super();
		id = new AccountNumber();
		this.customer = customer;
		System.out.println(String.format("New Account created %s for Customer %s", id.toString(),customer.getName()));
	}
	 public Account(){
		    
	  }
	/**
	 * @param id the id to set
	 */
	public void setId(AccountNumber id) {
		this.id = id;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(Double balance) {
		this.balance = balance;
	}

	/**
	 * @param services the services to set
	 */
	public void setServices(List<Service> services) {
		this.services = services;
	}

	/**
	 * @param invoices the invoices to set
	 */
	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void addService(Service service) {// here is the class where i add service under the customer
		if (services.contains(service)) {
			throw new IllegalArgumentException("Service already exists for this customer account");		
		}	
		services.add(service);
		System.out.println(String.format("New Service added %s for Customer %s", service.getName(), customer.getName()));
	}
	
	public boolean removeService(Service service) { 
		// here is the class where i remove service under the customer
		return services.remove(service);
	}
	
	public void addInvoice(Invoice invoice) {
		// here is the class where i add invoice under the customer and calculated the balance and add to the customer's balance 
		if (invoices.contains(invoice)) {
			throw new IllegalArgumentException("Invoice already exists for this customer account");
		}

		System.out.println(String.format("New Invoice added %s for Customer %s", invoice.getId(), customer.getName()));
		invoices.add(invoice);
		addToBalance(invoice.getTotal());
	}
	
	public boolean removeInvoice(Invoice invoice) {
		// here is the class where i remove invoice under the customer and calculated the balance and remove to the customer's balance 

		if(invoices.remove(invoice)) {
			System.out.println(String.format("Invoice removed %s for Customer %s", invoice.getId(), customer.getName()));
			removeFromBalance(invoice.getTotal());
			return true;
		}
		return false;
	}
	
	private void addToBalance(Double amount) {// here is the class where I calculated the balance  

		balance = balance + amount;
		System.out.println(String.format("Balance for Account %s is now %s", id.toString(), balance));
	}
	
	private void removeFromBalance(Double amount) {//		// here is the class where i add invoice under the customer and calculated the balance and add to the customer's balance 

		if (balance == 0D) { return; }
		balance = balance - amount;
		System.out.println(String.format("Balance for Account %s is now %s", id.toString(), balance));
	}
}
