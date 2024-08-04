package com.practice.ds;

import com.practice.ds.linkedlist.LinkedList;

public class LinkedListMainClass {

	public static void main(String[] args) {
		LinkedList linkedList= new LinkedList(24);
		linkedList.append(32);
		linkedList.append(56);
		
		linkedList.printList();
		
//		linkedList.removeLast();
//		System.out.println();
//		linkedList.printList();
//		
//		linkedList.removeLast();
//		System.out.println();
//		linkedList.printList();
		
		//linkedList.prepend(12);
		
//		System.out.println("After prepend: ");
//		linkedList.printList();
		
//		linkedList.removeFirst();
//		System.out.println("After remove first");
//		linkedList.printList();

	}
}
