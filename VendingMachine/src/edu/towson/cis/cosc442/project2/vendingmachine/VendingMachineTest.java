package edu.towson.cis.cosc442.project2.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class VendingMachineTest {
	public static final String A_CODE = "A";
	public static final String B_CODE = "B";
	public static final String C_CODE = "C";
	public static final String D_CODE = "D";
	VendingMachine machine1,machine2;
	VendingMachineItem item,item2,item3,item4;
	/**
	 * Sets the up.
	 */
	@Before
	public void setUp(){
		
		item = new VendingMachineItem("Reese's",1.00);
		item2 = new VendingMachineItem("Mnm", 1.25);
		item3 = new VendingMachineItem("ihy", 2.00);
		item4 = new VendingMachineItem("Gatorade",3.00);
		
		machine1 = new VendingMachine();
		machine2 = new VendingMachine();
		
		machine1.addItem(item, A_CODE);
		machine1.addItem(item3, D_CODE);
		machine1.removeItem(A_CODE);
		machine1.insertMoney(4.00);
		machine1.getBalance();
		machine1.makePurchase(D_CODE);
		machine1.returnChange();

		
		machine2.addItem(item2, B_CODE);
		machine2.addItem(item4, C_CODE);
		machine2.removeItem(B_CODE);
		machine2.insertMoney(3.00);
		machine2.getBalance();
		machine2.makePurchase(C_CODE);
		machine2.returnChange();
	}
	
	/**
	 * Testing to see if item added & stored in slot.
	 */
	@Test
	public void addItemTest() {
		assertEquals(item3.getName(), machine1.getItem(D_CODE));
		//assertEquals(item, machine1.equals(item));
	}
	
	/**
	 * 
	 * Testing to remove item from vending machine
	 * *
	 */
	@Test
	public void removeItemTest(){
		assertNotEquals(item, machine1.equals(item));
		
	}
	/**
	 * Testing to check if correct amount of money is inserted
	 */
	@Test
	public void insertMoneyTest(){
		assertEquals(4.00, machine1.balance, .01);
	}
	
	/**
	 * Test to check if the balance stored is correct from money inserted
	 */
	@Test
	public void getBalanceTest(){
		machine1.balance = 4.00;
		assertEquals(machine1.balance, machine1.getBalance(), .01);
	}
	
	/**
	 * Testing to see if a purchase was made
	 */
	@Test
	public void makePurchaseTest(){
		assertTrue(machine1.makePurchase(D_CODE));
	}
	
	/**
	 * Testing to see if right amount of change was returned
	 */
	@Test
	public void returnChangeTest(){
		assertEquals(2.00, machine1.returnChange(), .01);
		
	}
	/**
	 * Tear down.
	 */
	@After
	public void tearDown(){
		machine1 = null;
		machine2 = null;
	}

}