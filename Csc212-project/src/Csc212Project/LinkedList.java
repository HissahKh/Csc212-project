package Csc212Project;

public class LinkedList<T>{

  private Node<T> head;
	
	
	
	// needs modifying 
	

	public LinkedList() {
		
		head = null;
		
	}

	public LinkedList(Node<T> head) {
		
		head = head;
		
	}
	
	public boolean isEmpty() {
		
		return head == null;
		
	}
	
	public void add(T n) {
		
		Node<T> newNode = new Node<>(n);
		
		if(isEmpty())
			head = newNode;
		
		else {
			
			Node<T> current = head;
			
			while(current.getNext() != null) {
				
				current = current.getNext();
				
			}
			
			current.setNext(newNode);		
			
		}	
		
	}
	
	public T search(T s) {
		
		if(isEmpty())
			return null; //message?
		
		else {
			
			Node<T> current = head;
			
			while (current != null) {
				
				if(current.getData().equals(s))
					return current.getData();
				
				current = current.getNext();
				
			}
			
			return null;
			
		}
		
	}
	
	public void delete(T d) {
		
		if(isEmpty())
			return;   //message?
		
		if(head.getData().equals(d)) {
			head = head.getNext();
			return;
		}
		
		else {
			
            Node<T> current = head.getNext();
            Node<T> previous = head;
            	
			while (current != null) {
				
				if(current.getData().equals(d))
					previous.setNext(current.getNext());
				
				else {
					
					previous = current;
					
					current = current.getNext();
		
				}
				
			}
					
		}
	
	
	
	
	

}
	
	public boolean exist(Contact c) {
		
		Node<Contact> current = (Node<Contact>) head;
		
		while(!(current.getData().getContactName().equals(c.getContactName()))&&!(current.getData().getPhoneNu().equals(c.getContactName())))
		
	}


  

}
