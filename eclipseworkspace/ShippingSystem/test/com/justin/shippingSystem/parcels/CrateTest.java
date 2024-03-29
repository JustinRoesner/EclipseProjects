package com.justin.shippingSystem.parcels;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.justin.shippingSystem.Dimentions;
import com.justin.shippingSystem.address.Address;
import com.justin.shippingSystem.parcels.Crate;

public class CrateTest {
	private Crate crate;
	private Address address;
	private Dimentions dimentions;
	
	@Before
	public void init(){
		address = new Address("430 home st.", "Sycamore", "il", "60178");
		dimentions = new Dimentions(1,2,3);
		crate = new Crate("1ok", address, dimentions, "wood", 100);
	}
	@Test
	public void canWhatAmI(){
		Assert.assertEquals("Crate", crate.getType());
	}
	@Test
	public void canSpecialInformation(){
		Assert.assertEquals("The dimentions are 1.0x2.0x3.0its weight in lbs 100.0 "
				+ "its material is wood the Volume is 6.0 the weight per foot is 0.06", 
				crate.specialInformation());
	}
	@Test
	public void canGetDimention(){
		Assert.assertEquals(dimentions, crate.getDimention());
	}
}
