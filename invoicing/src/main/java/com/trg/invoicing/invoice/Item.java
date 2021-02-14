package com.trg.invoicing.invoice;

import com.trg.invoicing.order.Service;

public class Item {
	
	private Service service;
	private Integer qty;
	private Double amount = 0D;
	
	public Item(Service service, Integer qty) {
		super();
		this.service = service;
		this.qty = qty;
		calcAmount(qty, service.getPrice());
		System.out.println(String.format("Item total amount is %s", amount));
	}
	
	public Integer getQty() {
		return qty;
	}
	
	public Double getAmount() {
		return amount;
	}
	
	public String getName() {
		return service.getName();
	}
	
	private void calcAmount(Integer qty, Double amount) {
		this.amount = qty * amount;
	}
}
