package com.justin.totemBiz;
import com.justin.linkedlist.LinkNode;
import com.justin.linkedlist.LinkedList;

public class TotemSort {
	
	public LinkedList byHeight(LinkedList list){
		LinkNode current = list.getHead();
		LinkNode previous = null;
		boolean didFlip = true;
		
		float firstHeight = 0;
		float secondHeight = 0;

		Totem firstObject;
		Totem secondObject;
		
		LinkNode firstNode;
		LinkNode secondNode;
		int sizeOfList = list.size() - 2;
		
		while(didFlip){
			didFlip = false;
			
			for (int i = 0; i<sizeOfList; i++){
				firstObject = (Totem)current.getData();
				secondObject = (Totem)current.getNext().getData();
				
				firstHeight = firstObject.getHeight();
				secondHeight = secondObject.getHeight();
				
				
				firstNode = current;
				secondNode = current.getNext();
				
				System.out.println("first height = " + ((Totem)firstNode.getData()).getHeight() 
						+ "second height " + ((Totem)secondNode.getData()).getHeight());
				
				if (firstHeight > secondHeight){
					System.out.println("flipping");
					
					
					if (i == 0){
						list.setHead(secondNode);
						System.out.println("setting head to " + ((Totem)list.getHead().getData()).getHeight() );
						firstNode.setNext(secondNode.getNext());
						secondNode.setNext(firstNode);
					}else{
						firstNode.setNext(secondNode.getNext());
						secondNode.setNext(firstNode);	
						previous.setNext(secondNode);
					}
					
				
					didFlip = true;
					previous = current;
					current = secondNode.getNext();
				}else{
					previous = current;
					current = current.getNext();
				}
				
				System.out.println("end of for loop iteration");
			}
			System.out.println("end of while iteration");
			current = list.getHead();
			System.out.println("resetting current to head  " + ((Totem)list.getHead().getData()).getHeight() );
		}
		
		return list;
	}
	
	
}
