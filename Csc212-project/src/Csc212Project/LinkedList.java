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
			if(exist((Contact) n)) {
				System.out.println("The contact is already in");
				return;}//exist
		
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


		
		
		
		
		public boolean search(String s, int n) {
			
			if(isEmpty())
				return false; //message?
				
			
			current = head;
			
			while(current != null){
			
			if(n == 1) {
			
				if(s.equals(((Contact) current.getData()).getContactName()))
						{
				
				System.out.println(((Contact) current.getData()).getContactName() + "," + ((Contact) current.getData()).getPhoneNumber() + ","  + ((Contact) current.getData()).getEmailAddress() + "," + ((Contact) current.getData()).getAddress() + "," + ((Contact) current.getData()).getBirthday() + "," + ((Contact) current.getData()).getNote());
				
				}
			}
				
			if(n == 2){
			
				if(s.equals(((Contact) current.getData()).getPhoneNumber())){
				System.out.println(((Contact) current.getData()).getContactName() + "," + ((Contact) current.getData()).getPhoneNumber() + ","  + ((Contact) current.getData()).getEmailAddress() + "," + ((Contact) current.getData()).getAddress() + "," + ((Contact) current.getData()).getBirthday() + "," + ((Contact) current.getData()).getNote());
							
			}
				
			}
			if(n == 3){
				
				if(s.equals(((Contact) current.getData()).getEmailAddress())){
				
				System.out.println(((Contact) current.getData()).getContactName() + "," + ((Contact) current.getData()).getPhoneNumber() + ","  + ((Contact) current.getData()).getEmailAddress() + "," + ((Contact) current.getData()).getAddress() + "," + ((Contact) current.getData()).getBirthday() + "," + ((Contact) current.getData()).getNote());
					
			}
			}
			
			if(n == 4){
			
				if(s.equals(((Contact) current.getData()).getEmailAddress())){
				
					System.out.println(((Contact) current.getData()).getContactName() + "," + ((Contact) current.getData()).getPhoneNumber() + ","  + ((Contact) current.getData()).getEmailAddress() + "," + ((Contact) current.getData()).getAddress() + "," + ((Contact) current.getData()).getBirthday() + "," + ((Contact) current.getData()).getNote());
				
			}
			}
			
			if(n == 5){
			
				if(s.equals(((Contact) current.getData()).getBirthday())){
	
				System.out.println(((Contact) current.getData()).getContactName() + "," + ((Contact) current.getData()).getPhoneNumber() + ","  + ((Contact) current.getData()).getEmailAddress() + "," + ((Contact) current.getData()).getAddress() + "," + ((Contact) current.getData()).getBirthday() + "," + ((Contact) current.getData()).getNote());	
			}
			
			}
			current = current.next;
			}
			
			return true;
			
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
				
				if(current.getData().getContactName().compareTo(c.getContactName()) == 0 || current.getData().getPhoneNumber().compareTo(c.getPhoneNumber()) == 0 )
				   return true;
				
					
				current = current.getNext();
				
			}
			
			return false;
			
			
			
			
		}


	  

	}
