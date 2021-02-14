package com.trg.invoicing.invoice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Invoice {
	
	private InvoiceNumber id;
	private LocalDateTime createdAt = LocalDateTime.now();
	private List<Item> items = new ArrayList<>();
	private Double total = 0D;
	
	public Invoice() {
		id = new InvoiceNumber();
		System.out.println(String.format("New Invoice created %s", id.toString()));
	}

	public InvoiceNumber getId() {
		return id;
	}

	public LocalDateTime getCreateAt() {
		return createdAt;
	}

	public Double getTotal() {
		return total;
	}

	public List<Item> getItems() {
		return items;
	}
	
	public void addItem(Item item) {
		if (items.contains(item)) {
			throw new IllegalArgumentException("This item already exists in this invoice " + item.toString());
		}
		addToTotal(item.getAmount());
		items.add(item);
		System.out.println(String.format("Item added to Invoice %s - Qty: %s - Amount: %s", item.getName(), item.getQty(), item.getAmount()));
	}
	
	public void removeItem(Item item) {
		if (items.contains(item)) {
			if(items.remove(item)) {
				System.out.println(String.format("Item removed from Invoice %s - Qty: %s - Amount: %s", item.getName(), item.getQty(), item.getAmount()));
				removeFromTotal(item.getAmount());
			}
		} else {
			throw new IllegalArgumentException("This item does not exists in this invoice " + item.toString());
		}
	}
	
	private void addToTotal(Double amount) {
		total = total + amount;
		System.out.println(String.format("Total amount for Invoice %s is now %s", id.toString(), amount));
	}
	
	private void removeFromTotal(Double amount) {
		if (total == 0D) { return; }
		total = total - amount;
		System.out.println(String.format("Total amount for Invoice %s is now %s", id.toString(), amount));
	}
}
