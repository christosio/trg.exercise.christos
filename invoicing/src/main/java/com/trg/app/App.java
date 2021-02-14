package com.trg.app;

import com.trg.invoicing.account.Account;
import com.trg.invoicing.customer.Address;
import com.trg.invoicing.customer.Customer;
import com.trg.invoicing.invoice.Invoice;
import com.trg.invoicing.invoice.Item;
import com.trg.invoicing.order.Service;

/**
 * TRG Invoicing App
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Application started");
        
        // Create Customer
        Address address = new Address("Grigori Auxentiou 20","4003","Mesa Geitonia","Limassol", "Cyprus");
        Customer customer = new Customer("Christos Jr Ioannidies", address, "99 000000");
        
        // Create Account
        Account account = new Account(customer);
        
        // Create Services
        Service itConsulting = new Service("IT Consultancy", "IT Consultancy service", 1800D);
        Service outsourcedIt = new Service("Outsourced IT", "Outsourced IT service", 2540D);
        Service itStrategy = new Service("IT Strategy", "IT Strategy service", 1550D);
        
        // Add services under this account
        account.addService(itConsulting);
        account.addService(outsourcedIt);
        account.addService(itStrategy);
        
        // Init new customer invoice 1
        Invoice invoiceForServices1 = new Invoice();
        
        // Create an Invoice Item
        Item invoiceItemitemService1 = new Item(itConsulting, 2);
        Item invoiceItemitemService2 = new Item(outsourcedIt, 5);
        Item invoiceItemitemService3 = new Item(itStrategy, 15);
        
        Item invoiceItemitemService4 = new Item(outsourcedIt, 10);
        
        invoiceForServices1.addItem(invoiceItemitemService1);
        invoiceForServices1.addItem(invoiceItemitemService2);
        invoiceForServices1.addItem(invoiceItemitemService3);
        
        invoiceForServices1.addItem(invoiceItemitemService4);
        
        // Remove item because of an error
        invoiceForServices1.removeItem(invoiceItemitemService3);
        
        account.addInvoice(invoiceForServices1);
        
        
        // Init a new customer invoice 2
        Invoice invoiceForServices2 = new Invoice();
        
        // Create an Invoice Item
        Item invoiceItemitemService5 = new Item(itConsulting, 1);
        Item invoiceItemitemService6 = new Item(outsourcedIt, 6);
        Item invoiceItemitemService7 = new Item(itStrategy, 9);
        
        invoiceForServices2.addItem(invoiceItemitemService5);
        invoiceForServices2.addItem(invoiceItemitemService6);
        invoiceForServices2.addItem(invoiceItemitemService7);
        
        account.addInvoice(invoiceForServices2);
        
        // Remove invoice
        account.removeInvoice(invoiceForServices2);
        
        account.toString();
    }
}
