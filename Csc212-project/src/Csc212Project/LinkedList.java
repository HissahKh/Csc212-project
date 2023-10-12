package Csc212Project;

public class LinkedList<T>{

	  private Node<T> head;
	  private Node<T> current; 
		
		
		
		// needs modifying 
		

		public LinkedList() {
			
			head = current = null;
			
		}

		public LinkedList(Node<T> head) {
			
			head = head;
			
		}
		
		public boolean isEmpty() {
			
			return head == null;
			
		}
		
		public void findfirst () {
		       current = head;
		 }
		
		public void findnext () 
		{ current = current.next;
		 }
		
		 public T retrieve () {
		return current.getData(); }
		 
		public void update (T val) 
		{ current.data = val;
		}
		
		
		public boolean last () {
			return current.next == null;
			}
		
		
		
//add
		public void add(T n) {
			Node<T> newNode = new Node<>(n);		
			if(exist((Contact) n)) {return;}//exist
		
			if (head == null || ((Contact)head.getData()).getContactName().replaceAll("\\s+","").compareToIgnoreCase(((Contact)newNode.getData()).getContactName().replaceAll("\\s+","")) > 0) 
			{
				newNode.next = head;
				head = newNode;
			}
			else {
				 Node current = head;
			     while (current.next != null && ((Contact)current.next.getData()).getContactName().replaceAll("\\s+","").compareToIgnoreCase(((Contact)newNode.getData()).getContactName().replaceAll("\\s+","")) < 0)  {
			         current = current.next;
			     }
			     newNode.next = current.next;
			     current.next = newNode;
			     current = current.next;
			}}


		
		
		
		
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
				return ;   //message?
			
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
				
				if(current.getData().getContactName().compareTo(c.getContactName()) == 0 )
				   return true;
					
				current = current.getNext();
				
			}
			
			return false;
			
			
			
			
		}


	  

	}

  

}
