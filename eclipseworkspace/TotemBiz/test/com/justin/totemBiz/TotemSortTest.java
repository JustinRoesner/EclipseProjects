package com.justin.totemBiz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.justin.linkedlist.LinkedList;

public class TotemSortTest {
	Totem totemUnderTest1;
	Totem totemUnderTest2;
	Totem totemUnderTest3;
	Totem totemUnderTest4;
	LinkedList linkedListUnderTest;
	TotemReporter totemReporterUnderTest;
	TotemSort totemSortUnderTest;
	@Before
	public void init(){
		totemSortUnderTest = new TotemSort();
		totemReporterUnderTest = new TotemReporter();
		
		totemUnderTest1 = new Totem(6.2f, "justin", "wood", 4);
		totemUnderTest2 = new Totem(6.1f, "justin", "wood", 2);
		totemUnderTest3 = new Totem(6.4f, "justin", "wood", 3);
		totemUnderTest4 = new Totem(6.3f, "justin", "wood", 1);
		linkedListUnderTest = new LinkedList(totemUnderTest1);
		
		linkedListUnderTest.add(totemUnderTest1);
		linkedListUnderTest.add(totemUnderTest2);
		linkedListUnderTest.add(totemUnderTest3);
		linkedListUnderTest.add(totemUnderTest4);
		
	}
	@Test
	public void canByHeight(){
		totemSortUnderTest.byHeight(linkedListUnderTest);
		totemReporterUnderTest.printToConsole(linkedListUnderTest);
	}
}