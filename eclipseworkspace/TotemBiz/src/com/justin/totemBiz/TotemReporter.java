package com.justin.totemBiz;

import com.justin.linkedlist.LinkNode;
import com.justin.linkedlist.LinkedList;

public class TotemReporter {
	
	public void printToConsole(LinkedList list){
		LinkNode current = list.getHead();
		while (current != null){
			Totem currentTotem = (Totem)current.getData();
			System.out.println("name: " + currentTotem.getName());
			System.out.println("material: " + currentTotem.getMaterial());
			System.out.println("number of spirits: " + currentTotem.getTotalSpirits());
			current = current.getNext();
		}
		
		
	}
}
