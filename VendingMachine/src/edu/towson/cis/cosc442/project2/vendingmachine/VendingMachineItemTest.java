package edu.towson.cis.cosc442.project2.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class VendingMachineItemTest {
	
	VendingMachineItem item1,item2;
	
	
	@Before
	public void setUp(){
		item1 = new VendingMachineItem("Honey Bun",1.75);
		item2 = new VendingMachineItem("Reese's", 1.00);
	
			
	}
	
	/**
	 * Test.
	 */
	@Test
	public void getNameTest() {
		assertEquals("Honey Bun", item1.getName());
		assertEquals("Reese's", item2.getName());
	}
	
	
	@Test
	public void getPriceTest(){
		assertEquals(1.75, item1.getPrice(), .01);
		assertEquals(1.00, item2.getPrice(), .01);
	}
	
	/**
	 * Tear down.
	 */
	@After
	public void tearDown(){
		item1 = null;
		item2 = null;
	}

}


