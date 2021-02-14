package com.trg.invoicing.invoice;

import java.util.Objects;
import java.util.UUID;

public class InvoiceNumber {
	
private UUID number;
	
	public InvoiceNumber() {
		this.number = UUID.randomUUID();
	}
	
	public UUID getNumber() {
		return number;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof InvoiceNumber))
			return false;
		InvoiceNumber other = (InvoiceNumber) obj;
		return Objects.equals(number, other.number);
	}

	@Override
	public String toString() {
		return "InvoiceNumber [number=" + number + "]";
	}
	
	
}
