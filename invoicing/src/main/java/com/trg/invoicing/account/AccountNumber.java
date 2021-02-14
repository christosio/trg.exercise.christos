package com.trg.invoicing.account;

import java.util.Objects;
import java.util.UUID;

public class AccountNumber {
	// here I write the class AccountNumber , so I generate random number for account number  
	private UUID number;
	
	public AccountNumber() {/* Here I used UUID (Universally Unique identifier
	and the random number
	*/
		this.number = UUID.randomUUID();
	}
	
	public UUID getNumber() {//here I get number 
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(UUID number) {
		this.number = number;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {// i checked the object with accountNumber
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof AccountNumber))
			return false;
		AccountNumber other = (AccountNumber) obj;
		return Objects.equals(number, other.number);
	}  

	@Override
	public String toString() {
		return "AccountNumber [number=" + number + "]";//here I turn from number to string accountnumber
	}
	
	
}
