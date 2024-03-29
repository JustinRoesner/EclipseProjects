package com.justin.shippingSystem.address;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.justin.shippingSystem.address.Address;

public class AddressTest {
	private Address addressUnderTest;
	
	@Before
	public void init(){
		addressUnderTest = new Address("430 home st.", "sycamore", "il", "60178");
		
	}
	
	@Test
	public void testCanGetStreet(){
		Assert.assertEquals("430 home st.", addressUnderTest.getStreetAddress());
	}
	@Test
	public void testCanGetCity(){
		Assert.assertEquals("sycamore", addressUnderTest.getCity());
	}
	@Test
	public void testCanGetState(){
		Assert.assertEquals("il", addressUnderTest.getState());
	}
	@Test
	public void testCanGetZipcode(){
		Assert.assertEquals("60178", addressUnderTest.getZipcode());
	}
	
	
}
