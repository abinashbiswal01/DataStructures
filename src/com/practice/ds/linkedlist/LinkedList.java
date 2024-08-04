package com.practice.ds.linkedlist;

public class LinkedList {
	
	Node head;
	Node tail;
	int length;
	
	public LinkedList(int value) {
		Node newNode=new Node(value);
		
		head= newNode;
		tail= newNode;
		length= 1;
	}
	
	class Node{
		int value;
		Node next;
		
		Node (int value){
			this.value=value;
		}
	}
	//print the list
	public void printList() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.value+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	//methods of LinkedList
	
	//1. append at last
	public void append(int value) {
		Node newNode=new Node(value);
		if(length==0) {
			head=newNode;
			tail=newNode;
		}else {
			tail.next=newNode;
			tail=newNode;
		}
		length++;
	}
	
	//2. remove from last
	//use two variable pre and temp.
	//pre will point to temp and temp will point to temp.next ie one step ahead of pre
	
	public Node removeLast() {
		
		if(length==0) return null;
		
		Node temp=head;
		Node pre=head;
		
		while(temp.next!=null) {
			pre=temp;
			temp=temp.next;
		}
		
		//pre is 2nd last node now and temp is the last node
		tail=pre;
		tail.next=null;
		length--;
		
		//if length of list is 1. make head and tail point to null
		if(length==0) {
			head=null;
			tail=null;
		}
		
		return temp;
	}
	
	//3.prepend
	
	public void prepend(int value) {
		Node newNode= new Node(value);
		if(length==0) {
			head=newNode;
			tail=newNode;
		}else {
			newNode.next=head;
			head=newNode;
		}
		length++;
	}
	
	//4.remove first
	
	public Node removeFirst() {
		if(length==0) return null;
		
		Node temp=head;
		head=head.next;
		temp.next=null;
		length--;
		
		if(length==0) {
			tail=null;
		}
		
		return temp;
	}
	
	//5. get(index)
	
	public Node get(int index) {
		
		if(index<0 && index>=length) {
			return null;
		}
		
		Node temp=head;
		for(int i=0;i<index;i++) {
			
			temp=temp.next;
		}
		return temp;
	}
	
	public static void main(String[] args) {
		LinkedList linkedList= new LinkedList(24);
		linkedList.append(32);
		linkedList.append(56);
		
		System.out.println(linkedList.get(2).value);
	}
	
}
