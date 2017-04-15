package com.justin.shippingSystem;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LetterTest {
	Letter letterUnderTest;
	@Before
	public void init(){
		letterUnderTest = new Letter("102", "432 home st sycamore il", 3.30);
		
	}
	@Test
	public void canWhatAmI() {
		Assert.assertEquals("Letter", letterUnderTest.whatAmI());
	}
	@Test
	public void canSpecialInformation(){
		Assert.assertEquals("The postage is 3.3", letterUnderTest.specialInformation());
	}

}