/**
 * 
 */
package com.trg.invoicing.account;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.trg.invoicing.customer.Address;

/**
 * @author christosioannides
 *
 */
class AccountTest {

	/**
	 * @throws java.lang.Exception
	 */
	Account account;
	Address address;
	@BeforeEach
	void setUp() throws Exception {
	    account= new Account();
	    account.setCustomer("Rikka Genethliou Ioannidou",address,"99 666666");

	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.trg.invoicing.account.Account#Account(com.trg.invoicing.customer.Customer)}.
	 */
	@Test
	void testAccountCustomer() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.trg.invoicing.account.Account#Account()}.
	 */
	@Test
	void testAccount() {
		fail("Not yet implemented");
	}

}
