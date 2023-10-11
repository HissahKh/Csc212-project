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
		
		if(isEmpty()) {
			head = newNode;
			return;
		}
		
		if(exist((Contact) n)) {
			
			return;
			
		}
		
		if(((Contact) newNode.getData()).getContactName().compareToIgnoreCase(((Contact) head.getData()).getContactName()) < 0) {
			
			newNode.setNext(head);
			
			head = newNode;
			
			return;
			
		}
	
		else {
			
			Node<T> current = head;
			
			while(current != null) {
				
				if(((Contact) newNode.getData()).compareTo(((Contact) current.getData())) < 0) {
					
					current = current.getNext();
					
					continue;
					
				}				
				
				Node<T> temp = current.getNext();
				
				current.setNext(newNode);
				
				newNode.setNext(temp);
				
			}
			
			current.setNext(newNode);		
			
		}	
		
	}
	
	/*public T search(T s, int n) {
		
		if(isEmpty())
			return null; //message?
		
		if(n == 1) {
			
			
			
		}
		
		else {
			
			Node<T> current = head;
			
			while (current != null) {
				
				if(current.getData().equals(s))
					return current.getData();
				
				current = current.getNext();
				
			}
			
			return null;
			
		}
		
	}*/
	
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
		
		while(current != null){
			
			if(current.getData().getContactName().compareTo(c.getContactName()) == 0 || current.getData().getPhoneNumber().compareTo(c.getPhoneNumber()) == 0)
			   return true;
				
			current = current.getNext();
			
		}
		
		return false;
	}

  

}

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
		
		while(current != null){
			
			if(current.getData().getContactName().compareTo(c.getContactName()) == 0 || current.getData().getPhoneNumber().compareTo(c.getPhoneNumber()) == 0)
			   return true;
				
			current = current.getNext();
			
		}
		
		return false;
		
		
		
		
	}


  

}
