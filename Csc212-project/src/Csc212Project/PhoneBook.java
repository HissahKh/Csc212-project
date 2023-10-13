package Csc212Project;
public class Phonebook {
	
	static Scanner input = new Scanner(System.in);
	static LinkedList <Contact> a1 = new LinkedList<Contact>();
	static EventLinkedList <Event> e1 = new EventLinkedList<Event>();
	
	public static void displayContactFirstName(String n)//display contact who have the same first name.
	{
			System.out.println("The contact who have the first name are:");
			a1.findfirst();
			while(!a1.last()) {
			String [] full_name = a1.retrieve().getContactName().split(" ");
			String first_name = full_name[0]; //to get the first name 
			if(first_name.equalsIgnoreCase(n)) {
			System.out.println(a1.retrieve().getContactName() + " , " + a1.retrieve().getPhoneNumber() + " , " + a1.retrieve().getAddress() + " , " + a1.retrieve().getBirthday() + " , " + a1.retrieve().getNote());}
			a1.findnext();
			}
			String [] all_name = a1.retrieve().getContactName().split(" ");
			String first_name = all_name[0];
			if(first_name.equalsIgnoreCase(n)) {
			System.out.println(a1.retrieve().getContactName() + " , " + a1.retrieve().getPhoneNumber() + " , " + a1.retrieve().getAddress() + " , " + a1.retrieve().getBirthday() + " , " + a1.retrieve().getNote());}
		
	}
	
	public static void displayEventDetails(int c)
	{
		if(c == 1) {
		System.out.println("Enter the contact name: ");
		input.nextLine();
		String name1 = input.nextLine();
		e1.search(name1, c);
		}
		if(c == 2) {
		System.out.println("Enter the event title: ");
		input.nextLine();
		String name1 = input.nextLine();
		e1.search(name1, c);
		
		}
	}
	
	//displayEvents >> O(n)
	public static void displayEvents()// Print all events alphabetically >> its already ordered when we add the events >> so we just need to print it normally
	{
				e1.findfirst();
		while(!e1.last())
		{
			Event e2 = e1.retrieve();
			System.out.println(e2.getEventTitle() + "," + e2.getDateAndTime() + "," + e2.getLocation() + "," + e2.getContact().getContactName());
			e1.findnext();
		}
		Event e2 = e1.retrieve();
		System.out.println(e2.getEventTitle() + "," + e2.getDateAndTime() + "," + e2.getLocation() + "," + e2.getContact().getContactName());// for the last element
	}
	public static void displaySameEvent(String e) { //display contact with the same event
		e1.findfirst();
		while(!e1.last())
		{
			if(e1.retrieve().getEventTitle().equalsIgnoreCase(e))
			{
				System.out.println(e1.retrieve().getContact().getContactName());
			}
			e1.findnext();
		}
		if(e1.retrieve().getEventTitle().equalsIgnoreCase(e))
		{
			System.out.println(e1.retrieve().getContact().getContactName());
		}
	}
public static void main(String [] args) {	
System.out.println("WelcometotheLinkedTreePhonebook!");
int ch = 0;
do{
	System.out.println("Please choose an option:");
	System.out.println("1.Add a contact");
	System.out.println("2.Search for a contact");
	System.out.println("3.Delete a contact");
	System.out.println("4.Schedule an event");
	System.out.println("5.Print event details");
	System.out.println("6.Print contacts by firstname");
	System.out.println("7.Print all events alphabetically");
	System.out.println("8.Exit");
	int choice = input.nextInt();
	ch = choice;
	switch (choice)
	{
	case 1:
		//Add a Contact
		System.out.println("Enter the contact's name: ");
		input.nextLine();
		String name = input.nextLine();
		System.out.println("Enter the contact's phone number: ");
		String number = input.next();
		System.out.println("Enter the contact's email address: ");
		String email = input.next();
		System.out.println("Enter the contact's address: ");
		String adrs = input.next();
		System.out.println("Enter the contact's birthday: ");
		String Birthday = input.next();
		System.out.println("Enter any notes for the contact: ");
		String note = input.next();
		Contact newContact = new Contact(name , number , email , adrs , Birthday , note); //creating new contact
		a1.add(newContact); //add the contact to the list by order
		System.out.println("Thank you");
		break;
		
		
		
	case 2:
		//search
		System.out.println("Enter search criteria: ");
		System.out.println("1.Name");
		System.out.println("2.PhoneNumber");
		System.out.println("3.Email Address");
		System.out.println("4.Address");
		System.out.println("5.Birthday");
		int choice1 = input.nextInt();
		switch (choice1){
		case 1:
			System.out.println("Enter the contact name: ");
			input.nextLine();
			String n2 = input.nextLine();
			a1.search(n2, choice1); //in the search method it will print the details of the contacts
			break;
		case 2:
			System.out.println("Enter the phone number of the contact");
			String p2 = input.next();
			a1.search(p2, choice1);
			break;
		case 3:
			System.out.println("Enter the Email of the contact");
			String e2 = input.next();
			a1.search(e2, choice1);
			break;
		case 4:
			System.out.println("Enter the Address of the contact");
			input.nextLine();
			String a2 = input.nextLine();
			a1.search(a2, choice1);
			break;
		case 5:
			System.out.println("Enter the Birthday of the contact");
			input.nextLine();
			String b2 = input.nextLine();
			a1.search(b2, choice1);
			break;
		}
		break;
		
		
		
	case 3:
		//Delete by the phone number >> because logically two contacts can't have the same phone number >> so its unique  
		System.out.println("Enter the contact phone number that you want to delete: ");
		String ph = input.next();
		a1.findfirst();
		while(!a1.last())
		{
			if(a1.retrieve().getPhoneNumber().equals(ph)) {
			e1.findfirst();
			while(!e1.last()) {
				if(e1.retrieve().getContact().getPhoneNumber().equals(ph)) {
					e1.delete(e1.retrieve());
				}
				e1.findnext();
			}
			if(e1.retrieve().getContact().getPhoneNumber().equals(ph)) {
				e1.delete(e1.retrieve());
			}
			}
			if(a1.retrieve().getPhoneNumber().equals(ph)) {
				
				a1.delete(a1.retrieve());
			System.out.println("The contact has been deleted");}
			a1.findnext();
		}
		if(a1.retrieve().getPhoneNumber().equals(ph)) {
			e1.findfirst();
			while(!e1.last()) {
				if(e1.retrieve().getContact().getPhoneNumber().equals(ph)) {
					e1.delete(e1.retrieve());
				}
				e1.findnext();
			}
			if(e1.retrieve().getContact().getPhoneNumber().equals(ph)) {
				e1.delete(e1.retrieve());
			}

		a1.delete(a1.retrieve());
		System.out.println("The contact has been deleted");}
		
		break;
		
		
	case 4:
		//add an event 
		System.out.println("Enter event title: ");
		input.nextLine();
		String title = input.nextLine();
		System.out.println("Enter the contact name: ");
		String contact_n = input.nextLine();
		Contact contact1 = null;
		a1.findfirst();
		 //head for now 
		while(!a1.last())
		{
			if(a1.retrieve().getContactName().replaceAll("\\s+","").equalsIgnoreCase(contact_n.replaceAll("\\s+",""))){//Search for the contact by name and retrieve it 
				 contact1 = a1.retrieve();}
			a1.findnext();
		}
		if(a1.retrieve().getContactName().replaceAll("\\s+","").equalsIgnoreCase(contact_n.replaceAll("\\s+",""))) { //check for the last element
			contact1 = a1.retrieve();}
		if(contact1 == null) {
			System.out.println("The contact is unavailable ");
			break;
		}
		System.out.println("Enter event date and time: ");
		String date_time = input.nextLine();
		System.out.println("Enter event location: ");
		String location = input.nextLine();
		Event newEvent = new Event(title , date_time , location , contact1);
		e1.add(newEvent);
break;
		
	case 5:
		System.out.println("Enter search criteria:");
		System.out.println("1.contact name");
		System.out.println("2.Event tittle");
		int ch1 = input.nextInt();
		displayEventDetails(ch1);
		System.out.println("if you want to see the contacts that shares the same event please press 1");
		int enter = input.nextInt();
		if(enter == 1) {
			System.out.println("Please enter the event title: ");
			input.nextLine();
			String event_title = input.nextLine();
			displaySameEvent(event_title);	
		}
		else System.out.println("Thank you");
		break;

		
	case 6:
		System.out.println("Enter the contact first name");
		String Contact_firstName = input.next();
		displayContactFirstName(Contact_firstName);
		//Print contacts by first name
		
		break;
		
		
	case 7:
		displayEvents(); //>> calling the method for display
break;


case 8:
	ch = 8; //Exit
	break;
	
	default:
		System.out.println("Please enter the correct number!");
	}
	

}while(ch != 8);

a1.findfirst();
while(!a1.last()) {
	System.out.println(a1.retrieve().getContactName());
	a1.findnext();
	
}
System.out.println(a1.retrieve().getContactName());
a1.findnext();

}}
