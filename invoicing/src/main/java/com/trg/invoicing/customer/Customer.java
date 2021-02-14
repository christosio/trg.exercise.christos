package com.trg.invoicing.customer;

import java.util.Objects;

public class Customer {
	/**
	 * 
	 here I created the class customer anns make the object to string
	 */
	private String name;
	private Address address;
	private String phone;
	
	public Customer(String name, Address address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		System.out.println(String.format("New Customer created with name %s", name));
	}
	
	/**
	 * @return
	 */
	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Customer))
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(address, other.address) && Objects.equals(name, other.name)
				&& Objects.equals(phone, other.phone);
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
	
	
}
