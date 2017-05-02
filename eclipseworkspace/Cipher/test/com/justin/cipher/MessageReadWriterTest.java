package com.justin.cipher;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MessageReadWriterTest {
	MessageReadWriter messageReadWriter;
	@Before
	public void init(){
		messageReadWriter = new MessageReadWriter();
	}
	@Test
	public void canReadAndWriteMessage(){
		Assert.assertEquals(" ", messageReadWriter.readAndWriteMessage("Password.txt", "weoutboi.txt"));
	}
	
}
