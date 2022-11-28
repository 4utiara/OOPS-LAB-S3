import java.io.*;
import java.util.Scanner;

public class DoublyLinkedList {

	class Node {
		int data;
		Node previous;
		Node next;
		
		// Constructor
		public Node (int data){
			this.data = data;
		}		
	}
	
	public Node head = null;
	public Node tail = null;
	
	public void insertNodeFront (int data) {
		Node newNode = new Node (data);
		
		if (head == null) {
			head = newNode;
			tail = newNode;
			head.previous = null;
			tail.next = null;
		} else {
			head.previous = newNode;
			newNode.next = head;
			head = newNode;
			head.previous = null;	
		}		
	}
	
	public void insertNodeBack (int data) {
		Node newNode = new Node (data);
		
		if (head == null) {
			head = newNode;
			tail = newNode;
			head.previous = null;
			tail.next = null;
		} else {
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
			tail.next = null;
		}
	}
	public void insertNodePos(int data,int position){
	Node newNode = new Node(data);
	
	if (head == null) {
			head = newNode;
			tail = newNode;
			head.previous = null;
			tail.next = null;
	}
	else{
	node.data = data;
	node.
	}
	}
	
	public void display () {
				
		if (head == null){
			 System.out.println("List is empty!");
			 return;
		}
		
		System.out.println("--------DOUBLY LINKED LIST NODES---------");
		
		Node current = head;
		
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();		
	}
	

	
	public static void main(String args[]){
	
		DoublyLinkedList list = new DoublyLinkedList();
		
		Scanner sc = new Scanner(System.in);
		system.out.println("choose an aption from choices 1-3.\n1.insert elements\n 2.delete elements \n 3.display linked list ")
		int ch = sc.nextInt();
		if(ch==1){
		System.out.print("Enter the number of elements to be inserted: ");
		int n = sc.nextInt();
		
		while (n!= 0){
			System.out.print("\n-----------------------------------------\nWhere do you want to push the element?\n1 - Front\n2 - Back\n3 .Insert at an index position \nEnter your choice: ");
			
			
			
			
			int choice = sc.nextInt();
			int element;
			if (choice == 1){
				System.out.print("Enter the element to be inserted at the front: ");
				element = sc.nextInt();
				list.insertNodeFront(element);
				n--;
			} else if (choice == 2) {
				System.out.print("Enter the element to be inserted at the back: ");
				element = sc.nextInt();
				list.insertNodeBack(element);
				n--;
			} 
			if(choice==3){
			System.out.println("enter the index where you want to insert the element ");
			int index = sc.nextInt();
			System.out.println("enter the element you want to insert at the specified position");
			element= sc.nextInt();
			list.insertNodePos(element);
			}
			else {
				System.out.println("Invalid input. Try again!");
				continue;
			}
			list.display();
			System.out.println();
		}
	}
}
