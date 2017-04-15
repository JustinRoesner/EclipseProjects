package com.justin.shippingSystem;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BoxTest {
	Box boxUnderTest;
	@Before
	public void init(){
		boxUnderTest = new Box("100", "430 home st sycamore il", 10, 11, 1);
		
	}
	@Test
	public void canWhatAmI() {
		Assert.assertEquals("Box", boxUnderTest.whatAmI());
	}
	@Test
	public void canSpecialInformation(){
		Assert.assertEquals("The dimentions are 10.0x11.0x1.0", boxUnderTest.specialInformation());
	}

}
